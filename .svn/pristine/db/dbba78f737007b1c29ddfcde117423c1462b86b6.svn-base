package com.huatuo.customer.query;

import com.huatuo.customer.base.query.BaseQuery;

/**
 * 健康状态查询对象
 * 
 * @author lshaci
 * @createTime 2016年10月31日 上午11:18:48
 * @modifyTime 2016年10月31日 上午11:18:48
 */
public class HealthStatusQuery extends BaseQuery {

	private static final long serialVersionUID = -3893563707539206970L;
	
	/**
	 * 类型
	 */
	private Integer type;
	
	/**
	 * 测量值
	 */
	private Double value;
	
	/**
	 * 血压舒张压的值
	 */
	private Double bpValue;
	
	/**
	 * 测量时间
	 */
	private String measuringTime;

	/*
	 * 提供get和set方法
	 */
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getBpValue() {
		return bpValue;
	}

	public void setBpValue(Double bpValue) {
		this.bpValue = bpValue;
	}

	public Integer getEmpty() {
		return "空腹".equals(measuringTime.trim()) ? 1 : 0;
	}

	public void setMeasuringTime(String measuringTime) {
		this.measuringTime = measuringTime;
	}	
}
