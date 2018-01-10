package com.huatuo.customer.service;

import com.huatuo.customer.domain.LoginUserInfo;


/**
 * redis操作
 * @author master
 *
 */
public interface RedisService {

	/**
	 * 设置登录用户信息
	 * @param key
	 * @param value
	 * @param time
	 * @return
	 */
	public Boolean setUserInfoByLogin(String key, Object value, Integer time);

	/**
	 * 或许登录用户信息
	 * @param key
	 * @return
	 */
	public LoginUserInfo getUserInfoByLogin(String key);
	
}
