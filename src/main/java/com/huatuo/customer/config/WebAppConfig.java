package com.huatuo.customer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.huatuo.customer.interceptor.LoginInterceptor;

/**
 * 控制层注册配置类
 * @author master
 *
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter{
	
	/**
	 * 登录拦截器的添加
	 */
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/index/*")
                .excludePathPatterns("/address/*")
                .excludePathPatterns("/doctor/*")
                .excludePathPatterns("/org/*")
                .excludePathPatterns("/specialty/*")
                .excludePathPatterns("/team/listTeams")
                .excludePathPatterns("/team/getTeam")
                .excludePathPatterns("/evaluate/selectEvaluatesByPage")
                .excludePathPatterns("/team/getPackage")
                .excludePathPatterns("/fmsHost/*");
    }
	
	/**
	 * 注入RestTemplate
	 * @return
	 */
	@Bean  
	public RestTemplate restTemplate(){  
	    ClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();  
	    return new RestTemplate(clientHttpRequestFactory);  
	} 
}
