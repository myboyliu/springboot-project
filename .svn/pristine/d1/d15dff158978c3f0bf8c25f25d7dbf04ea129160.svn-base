package com.huatuo.customer.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Controller 结果响应
 * 
 * @author lshaci
 */
@JsonInclude(value = Include.NON_EMPTY)
public class ResultResponse {
	
	/**
	 * 是否成功标识, 默认为成功(true),
	 */
	private boolean success = true;
	/**
	 * 消息提示
	 */
	private String msg;
	/**
	 * 返回的数据
	 */
	private Object data;
	
	public ResultResponse(String successMsg) {
		this.msg = successMsg;
	}
	
	public ResultResponse(Object data) {
		this.data = data;
	}
	
	public ResultResponse(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}
	
	/*
	 * 提供get和set方法
	 */
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
