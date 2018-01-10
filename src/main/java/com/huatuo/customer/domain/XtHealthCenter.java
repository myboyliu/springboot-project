package com.huatuo.customer.domain;

import java.io.Serializable;
import java.util.UUID;

public class XtHealthCenter implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 健康中心id
	 */
	private String id = UUID.randomUUID().toString();
	
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
     * 录入人
     */
    private String userId;

    /**
     * 家庭成员测量人
     */
    private String familyId;

    /**
     * 健康状态
     */
    private String healthStatusId;

    /**
     * 不适症状
     */
    private String discomfort;

    /**
     * 备注
     */
    private String mark;
    
    /**
     * 测量血糖时的特殊情况
     */
    private String specialCase;
    
    /**
     * 测量血压时的心率
     */
    private Double xinlv;
    
  
    
    private Double presetMin; //设定值的下限（血压为收缩压下限,血糖空腹设定值的下限）
    private Double presetMax;  //设定值的上限（血压为收缩压上限、 血糖空腹设定值的上限）
    private Double bpPresetMin; //血压舒张压设定值的下限（血糖非空腹设定值的下限）
    private Double bpPresetMax; //血压舒张压设定值的上限（血糖非空腹设定值的上限） 
    private String healthStatus;//健康状态  
    private String prompt;//提示建议

    private Double maxMeaValue; //测量最大值（日，周，月）
    private Double minMeaValue; //测量最小值
    private Double maxDiaValue; //用于存放血压舒张压最大值
    private Double minDiaValue; //用于存放血压舒张压最小值
    private Double avgMeaValue; //用于存放体温测量平均值
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
        this.measuringDate = measuringDate == null ? null : measuringDate.trim();
    }

    public String getMeasuringTime() {
        return measuringTime;
    }

    public void setMeasuringTime(String measuringTime) {
        this.measuringTime = measuringTime == null ? null : measuringTime.trim();
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime == null ? null : recordTime.trim();
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId == null ? null : familyId.trim();
    }

    public String getHealthStatusId() {
        return healthStatusId;
    }

    public void setHealthStatusId(String healthStatusId) {
        this.healthStatusId = healthStatusId == null ? null : healthStatusId.trim();
    }

    public String getDiscomfort() {
        return discomfort;
    }

    public void setDiscomfort(String discomfort) {
        this.discomfort = discomfort == null ? null : discomfort.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
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
	
	public Double getMaxMeaValue() {
		return maxMeaValue;
	}

	public void setMaxMeaValue(Double maxMeaValue) {
		this.maxMeaValue = maxMeaValue;
	}

	public Double getMinMeaValue() {
		return minMeaValue;
	}

	public void setMinMeaValue(Double minMeaValue) {
		this.minMeaValue = minMeaValue;
	}

	public Double getMaxDiaValue() {
		return maxDiaValue;
	}

	public void setMaxDiaValue(Double maxDiaValue) {
		this.maxDiaValue = maxDiaValue;
	}

	public Double getMinDiaValue() {
		return minDiaValue;
	}

	public void setMinDiaValue(Double minDiaValue) {
		this.minDiaValue = minDiaValue;
	}
	
	public Double getAvgMeaValue() {
		return avgMeaValue;
	}

	public void setAvgMeaValue(Double avgMeaValue) {
		this.avgMeaValue = avgMeaValue;
	}
	
	public String getSpecialCase() {
		return specialCase;
	}

	public void setSpecialCase(String specialCase) {
		this.specialCase = specialCase;
	}
	

	public Double getXinlv() {
		return xinlv;
	}

	public void setXinlv(Double xinlv) {
		this.xinlv = xinlv;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", measuringDate=").append(measuringDate);
        sb.append(", measuringTime=").append(measuringTime);
        sb.append(", recordTime=").append(recordTime);
        sb.append(", measuringValue=").append(measuringValue);
        sb.append(", diastolicPressure=").append(diastolicPressure);
        sb.append(", userId=").append(userId);
        sb.append(", familyId=").append(familyId);
        sb.append(", healthStatusId=").append(healthStatusId);
        sb.append(", discomfort=").append(discomfort);
        sb.append(", mark=").append(mark);
        sb.append("]");
        return sb.toString();
    }
}