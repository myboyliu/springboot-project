package com.huatuo.customer.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.huatuo.customer.base.enums.ServiceType;

public class MzVisit implements Serializable{
	
	private static final long serialVersionUID = -8653813544070497997L;
	/**
	 * 业务订单主键id
	 */
	private Long visitId;
	/**
	 * 就诊号
	 */
    private String mzCode;
    /**
     * 下单用户id
     */
    private Long userId;
	/**
	 * 家庭成员id
	 */
    private Long memberId;
    /**
     * 本人标记
     */
    private Integer selfFlag;
    /**
     * 患者id
     */
    private Long patientId;
    /**
     * 患者就诊次数
     */
    private Integer times;
    /**
     * 登记时间
     */
    private String visitTime;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 医生id
     */
    private Long doctorId;
    /**
     * 医生名字
     */
    private String doctorName;
    /**
     * 临床职称
     */
    private String doctorTitlesClinical;
    /**
     * 教学职称
     */
    private String doctorTitlesTeach;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 服务费
     */
    private BigDecimal serviceCost;
    /**
     * 业务状态
     */
    private Integer status;
    /**
     * 就诊科室代码
     */
    private String visitDept;
    /**
     *	年龄
     */
    private String age;
    /**
     * 访问类型
     */
    private Integer visitType;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 预约开始时间
     */
    private String rStartTime;
    /**
     * 预约结束时间
     */
    private String rEndTime;
    /**
     * 预约诊号
     */
    private Integer reservationNum;
    /**
     * 预约审核状态
     */
    private Integer reservationTask;
    /**
     * 审核人id
     */
    private Long taskCid;
    /**
     * 审核时间
     */
    private String taskTime;
    /**
     * 预约时段id
     */
    private Long reservationId;
    /**
     * 病情描述
     */
    private String illnessDescribe;
    /**
     * 业务办理状态
     */
    private Integer dealState;
    /**
     * 改签以前的业务订单id
     */
    private Long oldVisitId;
    /**
     * 诊号取得的上限时间
     */
    private String tempStime;
    /**
     * 诊号取得的下限时间
     */
    private String tempEtime;
    /**
     * 是否改签0,不改签, 1改签
     */
    private Integer isChange;
    /**
     * 是否改签医生0,不改签, 1改签
     */
    private int isChangeDoctor;
    /**
     * 与visit一一对应订单号
     */
    private String orderNumber;
    /**
     * 用户评价id
     */
    private String evaluateId;
    /**
     * 问诊处方单提取码
     */
    private String extractedCode;
    /**
     * 医生团队id
     */
    private String dtTeamId;
    /**
     * 提取码长度
     */
    private Integer extractedCodeSize;
    
	public Integer getExtractedCodeSize() {
		return extractedCodeSize;
	}

	public void setExtractedCodeSize(Integer extractedCodeSize) {
		this.extractedCodeSize = extractedCodeSize;
	}

	public String getDtTeamId() {
		return dtTeamId;
	}

	public void setDtTeamId(String dtTeamId) {
		this.dtTeamId = dtTeamId;
	}

	public String getExtractedCode() {
		return extractedCode;
	}

	public void setExtractedCode(String extractedCode) {
		this.extractedCode = extractedCode;
	}

	public String getEvaluateId() {
		return evaluateId;
	}

	public void setEvaluateId(String evaluateId) {
		this.evaluateId = evaluateId;
	}

	public String getTempStime() {
		return tempStime;
	}

	public void setTempStime(String tempStime) {
		this.tempStime = tempStime;
	}

	public String getTempEtime() {
		return tempEtime;
	}

	public void setTempEtime(String tempEtime) {
		this.tempEtime = tempEtime;
	}

	public Integer getIsChange() {
		return isChange;
	}

	public void setIsChange(Integer isChange) {
		this.isChange = isChange;
	}

	public int getIsChangeDoctor() {
		return isChangeDoctor;
	}

	public void setIsChangeDoctor(int isChangeDoctor) {
		this.isChangeDoctor = isChangeDoctor;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getVisitId() {
		return visitId;
	}

	public void setVisitId(Long visitId) {
		this.visitId = visitId;
	}

	public String getMzCode() {
        return mzCode;
    }

    public void setMzCode(String mzCode) {
        this.mzCode = mzCode == null ? null : mzCode.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getSelfFlag() {
        return selfFlag;
    }

    public void setSelfFlag(Integer selfFlag) {
        this.selfFlag = selfFlag;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime == null ? null : visitTime.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public BigDecimal getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(BigDecimal serviceCost) {
        this.serviceCost = serviceCost;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getVisitDept() {
        return visitDept;
    }

    public void setVisitDept(String visitDept) {
        this.visitDept = visitDept == null ? null : visitDept.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public Integer getVisitType() {
        return visitType;
    }

    public void setVisitType(Integer visitType) {
        this.visitType = visitType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getrStartTime() {
        return rStartTime;
    }

    public void setrStartTime(String rStartTime) {
        this.rStartTime = rStartTime == null ? null : rStartTime.trim();
    }

    public String getrEndTime() {
        return rEndTime;
    }

    public void setrEndTime(String rEndTime) {
        this.rEndTime = rEndTime == null ? null : rEndTime.trim();
    }

    public Integer getReservationNum() {
        return reservationNum;
    }

    public void setReservationNum(Integer reservationNum) {
        this.reservationNum = reservationNum;
    }

    public Integer getReservationTask() {
        return reservationTask;
    }

    public void setReservationTask(Integer reservationTask) {
        this.reservationTask = reservationTask;
    }

    public Long getTaskCid() {
        return taskCid;
    }

    public void setTaskCid(Long taskCid) {
        this.taskCid = taskCid;
    }

    public String getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(String taskTime) {
        this.taskTime = taskTime == null ? null : taskTime.trim();
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public String getIllnessDescribe() {
        return illnessDescribe;
    }

    public void setIllnessDescribe(String illnessDescribe) {
        this.illnessDescribe = illnessDescribe == null ? null : illnessDescribe.trim();
    }

    public Integer getDealState() {
        return dealState;
    }

    public void setDealState(Integer dealState) {
        this.dealState = dealState;
    }

    public Long getOldVisitId() {
        return oldVisitId;
    }

    public void setOldVisitId(Long oldVisitId) {
        this.oldVisitId = oldVisitId;
    }
    
    public String getVisitTypeName(){
    	return this.visitType == null ? "" : ServiceType.getName(this.visitType);
    }

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorTitlesClinical() {
		return doctorTitlesClinical;
	}

	public void setDoctorTitlesClinical(String doctorTitlesClinical) {
		this.doctorTitlesClinical = doctorTitlesClinical;
	}

	public String getDoctorTitlesTeach() {
		return doctorTitlesTeach;
	}

	public void setDoctorTitlesTeach(String doctorTitlesTeach) {
		this.doctorTitlesTeach = doctorTitlesTeach;
	}
}