package com.huatuo.customer.domain;

import java.io.Serializable;


/**
 * 医生队列
 * @author caohu
 *
 */
public class FlexVisitQueuePojo implements Serializable, Comparable<FlexVisitQueuePojo> {

	private static final long serialVersionUID = 1L;
	/**
	 * 医生id
	 */
	private long doctorId;

	/**
	 * 在线标志
	 */
	private boolean online;
	/**
	 * 排队人数
	 */
	private int queuingNumber;
	/**
	 * 专科id
	 */
	private int specialtyId;
	/**
	 * 医生
	 */
	private Doctor doctor;
	
	/**
	 * 预约状态人数
	 */
	private int subscribeNum;
	
	/**
	 * 预约状态状态
	 */
	private boolean subscribeType;
	
	/**
     * 是否开通在线预约
     */
    private int isYy;
    
    /**
     * 
     */
    @SuppressWarnings("unused")
	private boolean isOnline;
    

	public FlexVisitQueuePojo() {
	};

	public FlexVisitQueuePojo(long doctorId, boolean online, int queuingNumber, int specialtyId) {
		this.doctorId = doctorId;
		this.online = online;
		this.queuingNumber = queuingNumber;
		this.specialtyId = specialtyId;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public int getQueuingNumber() {
		return queuingNumber;
	}

	public void setQueuingNumber(int queuingNumber) {
		this.queuingNumber = queuingNumber;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	public int getSpecialtyId() {
		return specialtyId;
	}

	public void setSpecialtyId(int specialtyId) {
		this.specialtyId = specialtyId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getSubscribeNum() {
		return subscribeNum;
	}

	public void setSubscribeNum(int subscribeNum) {
		this.subscribeNum = subscribeNum;
	}

	public boolean isSubscribeType() {
		return subscribeType;
	}

	public void setSubscribeType(boolean subscribeType) {
		this.subscribeType = subscribeType;
	}

	@Override
	public int compareTo(FlexVisitQueuePojo queue) {
		if (this.queuingNumber < queue.queuingNumber) {
			return -1;
		}
		if (this.queuingNumber > queue.queuingNumber) {
			return 1;
		}
		
		return doctor.getName().compareTo(queue.getvDoctorDetail().getName());
	}

	public int getIsYy() {
		return isYy;
	}

	public void setIsYy(int isYy) {
		this.isYy = isYy;
	}

	public Doctor getvDoctorDetail() {
		return doctor;
	}

	public void setvDoctorDetail(Doctor doctor) {
		this.doctor = doctor;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}
