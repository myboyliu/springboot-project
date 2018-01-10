package com.huatuo.customer.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class XtHealthStatus implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 健康状态id
	 */
    private String id;
    /**
     * 排序id
     */
    @JsonIgnore
    private Integer sortId;
    /**
     * 测量项目
     */
    @JsonIgnore
    private Integer type;
    /**
     * 设定值的下限（血压为收缩压下限、血糖空腹设定值的下限）
     */
    @JsonIgnore
    private Double presetMin;
    /**
     * 设定值的上限（血压为收缩压上限、血糖空腹设定值的上限）
     */
    @JsonIgnore
    private Double presetMax;
    /**
     * 血压舒张压设定值的下限（血糖非空腹设定值的下限）
     */
    @JsonIgnore
    private Double bpPresetMin;
    
    /**
     * 血压舒张压设定值的上限（血糖非空腹设定值的上限）
     */
    @JsonIgnore
    private Double bpPresetMax;

    /**
     * 健康状态
     */
    private String healthStatus;

    /**
     * 提示（建议）
     */
    private String prompt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getPresetMin() {
        return presetMin;
    }

    public void setPresetMin(Double presetMin) {
        this.presetMin = presetMin;
    }

    public Double getPresetMax() {
        return presetMax;
    }

    public void setPresetMax(Double presetMax) {
        this.presetMax = presetMax;
    }

    public Double getBpPresetMin() {
        return bpPresetMin;
    }

    public void setBpPresetMin(Double bpPresetMin) {
        this.bpPresetMin = bpPresetMin;
    }

    public Double getBpPresetMax() {
        return bpPresetMax;
    }

    public void setBpPresetMax(Double bpPresetMax) {
        this.bpPresetMax = bpPresetMax;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus == null ? null : healthStatus.trim();
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt == null ? null : prompt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sortId=").append(sortId);
        sb.append(", type=").append(type);
        sb.append(", presetMin=").append(presetMin);
        sb.append(", presetMax=").append(presetMax);
        sb.append(", bpPresetMin=").append(bpPresetMin);
        sb.append(", bpPresetMax=").append(bpPresetMax);
        sb.append(", healthStatus=").append(healthStatus);
        sb.append(", prompt=").append(prompt);
        sb.append("]");
        return sb.toString();
    }
}