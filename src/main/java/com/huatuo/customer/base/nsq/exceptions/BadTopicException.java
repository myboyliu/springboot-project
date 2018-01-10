package com.huatuo.customer.base.nsq.exceptions;

public class BadTopicException extends NSQException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadTopicException(String message) {
		super(message);
	}
}
