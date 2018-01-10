package com.huatuo.customer.exception;
/**
 * 业务下单异常对象
 * @author master
 *
 */
public class VisitException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8782514831128317547L;
	
	/**
	 * 异常消息
	 */
	private String message;

	public VisitException() {

	}

	public VisitException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
