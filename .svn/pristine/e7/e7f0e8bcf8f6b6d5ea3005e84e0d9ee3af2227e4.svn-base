package com.huatuo.customer.service;

import com.huatuo.register.domain.response.LoginDataResponse;


/**
 * redis操作
 * @author master
 *
 */
public interface LoginService {

	/**
	 * 放入redis缓存的时间
	 */
	public static final Integer LOGIN_USER_CACHE_TIME = 60 * 30;
	
	/**
	 * 设置登录用户信息
	 * @param key
	 * @param value
	 * @param time
	 * @return
	 */
	public Boolean setUserInfoByLogin(String key, LoginDataResponse loginDataResponse, Integer time);

	/**
	 * 获取登录用户信息
	 * @param key
	 * @return
	 */
	public LoginDataResponse getUserInfoByLogin(String key);
	
	/**
	 * 用户退出登录
	 * @param token
	 */
	public void userLogout(String token);
	
	/**
	 * 更新缓存中登录用户的信息以及数据库用户信息
	 * @return
	 */
	public Boolean updateUserInfo(String token);
	
}
