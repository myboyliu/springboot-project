package com.huatuo.customer.service;

import com.huatuo.customer.domain.XtFmsHost;

public interface XtFmsHostService {

	XtFmsHost selectByPrimaryKey(Integer hostId);
	
	/**
	 * 得到主机地址
	 * @param accessToken
	 * @param mid	医生id或者就诊室id
	 * @return
	 */
	public XtFmsHost getHost(String accessToken, Long mid);
}
