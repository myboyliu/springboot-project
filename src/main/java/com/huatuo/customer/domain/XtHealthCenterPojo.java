package com.huatuo.customer.domain;

import java.io.Serializable;

public class XtHealthCenterPojo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 健康状态
	 */
	private String  healthStatus;
	
	/**
	 * 对应健康状态次数
	 */
	private Integer count;
	
	/**
	 *最后结果
	 */
	private String resultMeg; 
	
	public String getResultMeg() {
		return resultMeg;
	}
	public void setResultMeg(String resultMeg) {
		this.resultMeg = resultMeg;
	}
	public String getHealthStatus() {
		return healthStatus;
	}
	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	

}
