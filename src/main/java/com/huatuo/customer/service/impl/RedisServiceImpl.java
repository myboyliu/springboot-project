package com.huatuo.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.base.redis.RedisSupport;
import com.huatuo.customer.domain.LoginUserInfo;
import com.huatuo.customer.service.RedisService;

@Service
public class RedisServiceImpl implements RedisService{

	@Autowired
	private RedisSupport redisSupport;
	
	@Override
	public Boolean setUserInfoByLogin(String key, Object value, Integer time) {
		return redisSupport.set(key, value, time);
	}

	@Override
	public LoginUserInfo getUserInfoByLogin(String key) {
		return (LoginUserInfo) redisSupport.get(key);
	}

}
