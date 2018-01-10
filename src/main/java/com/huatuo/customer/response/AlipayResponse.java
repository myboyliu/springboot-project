package com.huatuo.customer.response;

import com.huatuo.customer.base.response.BaseResponse;

/**
 * 支付宝支付携带信息的返回对象
 * @author master
 *
 */
public class AlipayResponse extends BaseResponse{
	
	private static final long serialVersionUID = -8448924770669668907L;
	/**
	 * 支付宝支付参数信息
	 */
	private String resultPayInfo;
	/**
	 * 返回结果
	 */
	private String resul;
	
	/**
	 * 每次请求支付参数的随机数令牌
	 */
	private String token;
	
	/**
	 *	是否是0元订单的标志，0不是，1是
	 */
	private Integer isZeroOrder;
	
	/**
	 * 支付订单的业务状态
	 */
	private Integer serviceState;
	
	public Integer getServiceState() {
		return serviceState;
	}

	public void setServiceState(Integer serviceState) {
		this.serviceState = serviceState;
	}

	public Integer getIsZeroOrder() {
		return isZeroOrder;
	}

	public void setIsZeroOrder(Integer isZeroOrder) {
		this.isZeroOrder = isZeroOrder;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getResul() {
		return resul;
	}

	public void setResul(String resul) {
		this.resul = resul;
	}

	public String getResultPayInfo() {
		return resultPayInfo;
	}

	public void setResultPayInfo(String resultPayInfo) {
		this.resultPayInfo = resultPayInfo;
	}
	
}
