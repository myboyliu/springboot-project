package com.huatuo.customer.service;

import com.huatuo.customer.domain.PayInfo;

public interface PayInfoService {
	/**
	 * 增加一天支付订单信息
	 * @param payInfo
	 * @return
	 */
	public Integer savePayInfo(PayInfo payInfo);
	
	/**
	 * 通过订单号查询一条支付信息
	 * @param orderNo
	 * @return
	 */
	public PayInfo selectPayInfoByOrderNo(String orderNo);
	
}
