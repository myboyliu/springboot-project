package com.huatuo.customer.service.impl;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.base.redis.RedisSupport;
import com.huatuo.customer.dao.XtAddressMapper;
import com.huatuo.customer.dao.XtPersonMapper;
import com.huatuo.customer.dao.XtUserMapper;
import com.huatuo.customer.service.LoginService;
import com.huatuo.register.domain.XtPerson;
import com.huatuo.register.domain.XtUser;
import com.huatuo.register.domain.response.LoginDataResponse;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{

	@Autowired
	private RedisSupport redisSupport;
	
	@Autowired
	private XtAddressMapper xtAddressMapper;
	
	@Autowired
	private XtPersonMapper xtPersonMapper;
	
	@Autowired
	private XtUserMapper xtUserMapper;

	@Override
	public Boolean setUserInfoByLogin(String key, LoginDataResponse loginDataResponse, Integer time) {
		return redisSupport.set(key, loginDataResponse, time);
	}

	@Override
	public LoginDataResponse getUserInfoByLogin(String key) {
		Serializable serializable = redisSupport.get(key);
		if(serializable != null){
			return (LoginDataResponse) serializable;
		}else{
			return null;
		}
	}

	@Override
	public void userLogout(String token) {
		redisSupport.delete(token);
	}

	@Override
	public Boolean updateUserInfo(String token) {
		Serializable serializable = redisSupport.get(token);
		if(serializable != null){
			LoginDataResponse loginDataResponse = (LoginDataResponse) serializable;
			loginDataResponse.setXtAddress(xtAddressMapper.selectByPrimaryKeyForLogin(
					Long.parseLong(loginDataResponse.getXtAddress().getAddressId())));
			XtPerson xtPerson = xtPersonMapper.selectByUserIdForLogin(
					Long.parseLong(loginDataResponse.getXtPerson().getUserId()));
			loginDataResponse.setXtPerson(xtPerson);
			XtUser xtUser = xtUserMapper.selectByPrimaryKeyForLogin(
					Long.parseLong(loginDataResponse.getXtUser().getUserId()));
			xtUser.setUserId(xtPerson.getUserId());
			loginDataResponse.setXtUser(xtUser);
			return this.setUserInfoByLogin(token, loginDataResponse, LoginService.LOGIN_USER_CACHE_TIME);
		}else{
			throw new RuntimeException("或许登录用户信息失败");
		}
	}
	
}
