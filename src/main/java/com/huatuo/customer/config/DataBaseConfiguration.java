package com.huatuo.customer.config;

import java.util.Arrays;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.huatuo.customer.base.util.ConfigProperites;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * 数据库配置
 * @author master
 *
 */
@Configuration
@EnableTransactionManagement
public class DataBaseConfiguration implements EnvironmentAware {

	private RelaxedPropertyResolver propertyResolver;

	private static Logger log = LoggerFactory
			.getLogger(DataBaseConfiguration.class);

	private Environment env;

	@Override
	public void setEnvironment(Environment env) {
		this.env = env;
		this.propertyResolver = new RelaxedPropertyResolver(env,
				ConfigProperites.getApplicationSpringDatasource());
	}

	@Bean(destroyMethod = "shutdown")
	public DataSource dataSource() {
		log.debug("Configruing DataSource");
		if (propertyResolver.getProperty("url") == null
				&& propertyResolver.getProperty("databaseName") == null) {
			log.error(
					"Your database connection pool configuration is incorrect! The application"
							+ "cannot start. Please check your Spring profile, current profiles are: {}",
					Arrays.toString(env.getActiveProfiles()));
			throw new ApplicationContextException(
					"DataBase connection pool is not configured correctly");
		}
		HikariConfig config = new HikariConfig();
		config.setDataSourceClassName(propertyResolver
				.getProperty("dataSourceClassName"));
		config.addDataSourceProperty("url", propertyResolver.getProperty("url"));
		config.setUsername(propertyResolver.getProperty("username"));
		config.setPassword(propertyResolver.getProperty("password"));
		if ("com.mysql.jdbc.jdbc2.optional.MysqlDataSource"
				.equals(propertyResolver.getProperty("dataSourceClassName"))) {
			config.addDataSourceProperty("cachePrepStmts",
					propertyResolver.getProperty("cachePrepStmts", "true"));
			config.addDataSourceProperty("prepStmtCacheSize",
					propertyResolver.getProperty("prepStmtCacheSize", "250"));
			config.addDataSourceProperty("prepStmtCacheSqlLimit",
					propertyResolver.getProperty("prepStmtCacheSqlLimit",
							"2048"));
			config.addDataSourceProperty("useServerPrepStmts",
					propertyResolver.getProperty("useServerPrepStmts", "true"));
		}
		return new HikariDataSource(config);
	}

}
