package com.huatuo.customer.config;

import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import redis.clients.jedis.JedisPoolConfig;

import com.huatuo.customer.base.util.ConfigProperites;

/**
 * redis配置
 * @author master
 *
 */
@Configuration
public class RedisConfig implements EnvironmentAware{
	
	private RelaxedPropertyResolver propertyResolver;

	@SuppressWarnings("unused")
	private Environment env;
	
	@Override
	public void setEnvironment(Environment env) {
		this.env = env;
		this.propertyResolver = new RelaxedPropertyResolver(env,
				ConfigProperites.getApplicationSpringRedis());
	}

	@Bean  
    public RedisConnectionFactory jedisConnectionFactory(){  
        JedisPoolConfig poolConfig = new JedisPoolConfig();  
        poolConfig.setMaxTotal(Integer.parseInt(propertyResolver.getProperty("pool.maxActive")));  
        poolConfig.setMaxIdle(Integer.parseInt(propertyResolver.getProperty("pool.maxIdle")));  
        poolConfig.setMaxWaitMillis(Integer.parseInt(propertyResolver.getProperty("pool.maxWait")));  
        poolConfig.setTestOnBorrow(true);  
        poolConfig.setTestOnCreate(true);  
        poolConfig.setTestWhileIdle(true);  
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(poolConfig);  
        jedisConnectionFactory.setHostName(propertyResolver.getProperty("url"));  
        jedisConnectionFactory.setPassword(propertyResolver.getProperty(""));  
        jedisConnectionFactory.setPort(Integer.parseInt(propertyResolver.getProperty("port")));  
        return jedisConnectionFactory;  
    }  
	
	@SuppressWarnings("rawtypes")
	@Bean
	public RedisTemplate redisTemplate(){  
        RedisTemplate<?, ?> redisTemplate = new RedisTemplate();  
        redisTemplate.setConnectionFactory(jedisConnectionFactory()); 
        redisTemplate.setStringSerializer(new StringRedisSerializer());
        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Object.class));
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashValueSerializer(new Jackson2JsonRedisSerializer<>(Object.class));
        return redisTemplate;  
    }  
}	
