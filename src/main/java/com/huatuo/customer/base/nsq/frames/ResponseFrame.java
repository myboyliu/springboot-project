package com.huatuo.customer.base.nsq.frames;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResponseFrame extends NSQFrame {
	private static final Logger logger = LoggerFactory.getLogger(ResponseFrame.class);
	public String getMessage() {
		try {
			return new String(getData(), "utf8");
		} catch (UnsupportedEncodingException e) {
			logger.error("Caught", e);
		}
		return null;
	}
	
	public String toString() {
		return "RESPONSE: " + this.getMessage();
	}
}
