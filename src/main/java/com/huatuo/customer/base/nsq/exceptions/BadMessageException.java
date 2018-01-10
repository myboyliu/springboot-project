package com.huatuo.customer.base.nsq.exceptions;

public class BadMessageException extends NSQException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadMessageException(String message) {
		super(message);
	}
}
