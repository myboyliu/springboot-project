package com.huatuo.customer.base.nsq.callbacks;

import com.huatuo.customer.base.nsq.NSQMessage;

public interface NSQMessageCallback {

	public void message(NSQMessage message);
}
