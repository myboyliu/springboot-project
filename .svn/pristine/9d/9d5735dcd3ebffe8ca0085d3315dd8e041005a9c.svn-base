package com.huatuo.customer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.response.UserResponse;
import com.huatuo.customer.service.LoginService;


@RequestMapping(value = "user")
@RestController
public class UserController {
	
	@Autowired
	private LoginService loginService;
	
	/**
	 * 用户退出登录
	 * @param request
	 * @return
	 */
	@GetMapping(value = "logout")
	public Object logout(HttpServletRequest request){
		UserResponse userResponse = new UserResponse();
		loginService.userLogout(Utils.getToken(request));
		userResponse.setCode(BaseResponse.SUCCESS_CODE);
	    userResponse.setMessage(BaseResponse.SUCCESS_MESSAGE); 
		return userResponse;
	}
	
}
