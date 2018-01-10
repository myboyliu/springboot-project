package com.huatuo.customer.domain;

import java.io.Serializable;

/**
 * 医生服务设置对象
 * @author master
 *
 */
public class XtReservation implements Serializable{
	
	private static final long serialVersionUID = -2945621275660917624L;
	/*
	 * 服务设置id
	 */
    private Long reservationId;
    /**
     * 医生用户id
     */
    private Long doctorUid;
    /**
     * 星期
     */
    private Integer week;
    /**
     * 时间段
     */
    private Integer interval;
    /**
     * 预约开始时间
     */
    private String startTime;
    /**
     * 预约结束时间
     */
    private String endTime;
    /**
     * 视频问诊人数
     */
    private Integer sCount;
    /**
     * 预约人数
     */
    private Integer yCount;
    /**
     * 图文咨询人数
     */
    private Integer tCount;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 删除标记
     */
    private Integer isDel;
    /**
     * 余号数
     */
    private Integer surplusTotal;
    /**
     * 展示的时间段
     */
    private String showDate;
    
    public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	public Integer getSurplusTotal() {
		return surplusTotal;
	}

	public void setSurplusTotal(Integer surplusTotal) {
		this.surplusTotal = surplusTotal;
	}

	public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Long getDoctorUid() {
        return doctorUid;
    }

    public void setDoctorUid(Long doctorUid) {
        this.doctorUid = doctorUid;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Integer getsCount() {
        return sCount;
    }

    public void setsCount(Integer sCount) {
        this.sCount = sCount;
    }

    public Integer getyCount() {
        return yCount;
    }

    public void setyCount(Integer yCount) {
        this.yCount = yCount;
    }

    public Integer gettCount() {
        return tCount;
    }

    public void settCount(Integer tCount) {
        this.tCount = tCount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", reservationId=").append(reservationId);
        sb.append(", doctorUid=").append(doctorUid);
        sb.append(", week=").append(week);
        sb.append(", interval=").append(interval);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", sCount=").append(sCount);
        sb.append(", yCount=").append(yCount);
        sb.append(", tCount=").append(tCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", isDel=").append(isDel);
        sb.append("]");
        return sb.toString();
    }
}