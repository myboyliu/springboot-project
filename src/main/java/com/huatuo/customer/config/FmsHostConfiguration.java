package com.huatuo.customer.config;

import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.huatuo.customer.base.util.ConfigProperites;
import com.huatuo.customer.response.FmsHostConfigResponse;

@Configuration
public class FmsHostConfiguration implements EnvironmentAware {

	private RelaxedPropertyResolver propertyResolver;

	private Environment env;
	
	@Override
	public void setEnvironment(Environment arg0) {
		this.env = arg0;
		this.propertyResolver = new RelaxedPropertyResolver(env,
				ConfigProperites.getApplicationFmsHost());
	}
	
	@Bean
	public FmsHostConfigResponse fmsHostConfigResponse(){
		FmsHostConfigResponse fmsHostConfigResponse = new FmsHostConfigResponse();
		fmsHostConfigResponse.setHost(propertyResolver.getProperty("host"));
		fmsHostConfigResponse.setApplication(propertyResolver.getProperty("application"));
		fmsHostConfigResponse.setApplicationStream(propertyResolver.getProperty("applicationStream"));
		fmsHostConfigResponse.setRootJSPURL(propertyResolver.getProperty("rootJSPURL"));
		fmsHostConfigResponse.setRootURL(propertyResolver.getProperty("rootURL"));
		fmsHostConfigResponse.setRootContentURL(propertyResolver.getProperty("rootContentURL"));
		fmsHostConfigResponse.setPrintURL(propertyResolver.getProperty("printURL"));
		fmsHostConfigResponse.setPerformance(propertyResolver.getProperty("performance"));
		fmsHostConfigResponse.setResourcePath(propertyResolver.getProperty("resourcePath"));
		fmsHostConfigResponse.setAuthorizeURL(propertyResolver.getProperty("authorizeURL"));
		fmsHostConfigResponse.setRemoteAssistUrl(propertyResolver.getProperty("remoteAssistUrl"));
		return fmsHostConfigResponse;
	}
}
