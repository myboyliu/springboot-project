package com.huatuo.customer.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 健康中心历史数据
 * 
 * @author lshaci
 * @createTime 2016年11月1日 上午10:58:06
 * @modifyTime 2016年11月1日 上午10:58:06
 */
@JsonInclude(value = Include.NON_EMPTY)
public class XtHealthCenterHistory implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 健康中心id
	 */
	private String id;
	
	/**
	 * 测量项目（1：血压、2：心率：3、体温、4：血糖）
	 */
    private Integer type;
    
    /**
     * 测量日期（yyyy-MM-dd）
     */
    private String measuringDate;
    
    /**
     * 测量时间（HH:mm 早餐前、空腹等）
     */
    private String measuringTime;

    /**
     * 记录时间（yyyy-MM-dd HH:mm:ss）
     */
    private String recordTime;

    /**
     * 测量值
     */
    private Double measuringValue;

    /**
     * 血压-舒张压
     */
    private Double diastolicPressure;

    /**
     * 测量人
     */
    private String name;

    /**
     * 不适症状
     */
    private String discomfort;

    /**
     * 备注
     */
    private String mark;
    
    /**
     * 健康状态
     */
    private String healthStatus;
    
    /**
     * 提示（建议）
     */
    private String prompt;

    /*
     * 提供set和get方法
     */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getMeasuringDate() {
		return measuringDate;
	}

	public void setMeasuringDate(String measuringDate) {
		this.measuringDate = measuringDate;
	}

	public String getMeasuringTime() {
		return measuringTime;
	}

	public void setMeasuringTime(String measuringTime) {
		this.measuringTime = measuringTime;
	}

	public String getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}

	public Double getMeasuringValue() {
		return measuringValue;
	}

	public void setMeasuringValue(Double measuringValue) {
		this.measuringValue = measuringValue;
	}

	public Double getDiastolicPressure() {
		return diastolicPressure;
	}

	public void setDiastolicPressure(Double diastolicPressure) {
		this.diastolicPressure = diastolicPressure;
	}

	public String getName() {
		if (name == null || "".equals(name.trim())) {
			name = "本人";
		}
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscomfort() {
		return discomfort;
	}

	public void setDiscomfort(String discomfort) {
		this.discomfort = discomfort;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
    
}