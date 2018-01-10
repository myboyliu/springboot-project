package com.huatuo.customer.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;

import org.springframework.util.StringUtils;

import com.huatuo.customer.base.enums.PayOrderState;
import com.huatuo.customer.base.enums.ServiceType;
import com.huatuo.customer.base.enums.TitlesClinicalType;
import com.huatuo.customer.base.enums.TitlesTeachType;
import com.huatuo.customer.base.util.Utils;

/**
 * 订单相关的查询返回结果
 * @author master
 *
 */
public class OrderResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6794404460145036232L;
	/**
	 * 业务订单id
	 */
	private Long visitId;
	/**
	 * 订单号
	 */
	private String orderNo;
	/**
	 * 医生id
	 */
	private Long doctorId;
	/**
	 * 专科id
	 */
	private Integer specialtyId;
	/**
	 * 组织结构id
	 */
	private Integer orgId;
	/**
	 * 患者id
	 */
	private Long patientId;
	/**
	 * 业务订单类型
	 */
	private Integer visitType;
	/**
	 * 服务费用
	 */
	private BigDecimal serviceCost;
	/**
	 * 支付订单状态
	 */
	private Integer orderState;
	/**
	 * 医生名字
	 */
	private String doctorName;
	/**
	 * 临床职称id
	 */
	private Integer titlesClinical;
	/**
	 * 教学职称id
	 */
	private Integer titlesTeach;
	/**
	 * 患者名字
	 */
	private String patientName;
	/**
	 * 医院名称
	 */
	private String orgName;
	/**
	 * 专科名字
	 */
	private String specialtyName;
	/**
	 * 支付订单创建时间
	 */
	private String payOrderCreateTime;
	/**
	 * 服务开始时间
	 */
	private String startTime;
	/**
	 * 服务结束时间
	 */
  	private String endTime;
  	/**
  	 * 患者电话号码
  	 */
  	private String patientMobile;
  	/**
  	 * 患者性别
  	 */
  	private String patientSex;
  	/**
  	 * 患者出生日期
  	 */
  	private String patientBirthDate;
  	/**
  	 * 患者地址id
  	 */
  	private Long addressId;
  	/**
  	 * 患者地址省份名
  	 */
  	private String addressProvince;
  	/**
  	 * 患者地址城市名
  	 */
  	private String addressCity;
  	/**
  	 * 患者地址区县名
  	 */
  	private String addressCountry;
  	/**
  	 * 患者地址街道名
  	 */
  	private String addressRoad;
  	/**
  	 * 患者地址详情
  	 */
  	private String addressDetails;
  	/**
  	 * 医生平均就诊时间
  	 */
  	private String doctorAvgTime;
  	/**
  	 * 订单业务区分
  	 */
  	private Integer mode;
  	/**
  	 * 医生头像地址
  	 */
  	private String doctorPicture;
  	/**
  	 * 预约开始时间
  	 */
  	private String rStartTime;
  	/**
  	 * 预约结束时间
  	 */
  	private String rEndTime;
  	/**
  	 * 用户评价id
  	 */
  	private String evaluateId;
  	/**
  	 * 业务订单id
  	 */
  	private Integer serviceState;
  	/**
  	 * 预约审核状态
  	 */
  	private Integer reservationTask;
  	/**
  	 * 医生是否在线
  	 */
  	private boolean doctorIsOnline;
  	
  	/**
  	 * 医生团队id
  	 */
  	private String doctorTeamId;
  	
  	public String getDoctorTeamId() {
		return doctorTeamId;
	}

	public void setDoctorTeamId(String doctorTeamId) {
		this.doctorTeamId = doctorTeamId;
	}

	public boolean isDoctorIsOnline() {
		return doctorIsOnline;
	}

	public void setDoctorIsOnline(boolean doctorIsOnline) {
		this.doctorIsOnline = doctorIsOnline;
	}

	public Integer getReservationTask() {
		return reservationTask;
	}

	public void setReservationTask(Integer reservationTask) {
		this.reservationTask = reservationTask;
	}

	public Integer getServiceState() {
		return serviceState;
	}

	public void setServiceState(Integer serviceState) {
		this.serviceState = serviceState;
	}

	public String getEvaluateId() {
		return evaluateId;
	}

	public void setEvaluateId(String evaluateId) {
		this.evaluateId = evaluateId;
	}

	public String getrStartTime() {
		return rStartTime;
	}

	public void setrStartTime(String rStartTime) {
		this.rStartTime = rStartTime;
	}

	public String getrEndTime() {
		return rEndTime;
	}

	public void setrEndTime(String rEndTime) {
		this.rEndTime = rEndTime;
	}
	/**
  	 * 预约订单非当天待服务的订单不能进入门诊
  	 * 
  	 */
  	public Integer getCanJoinVisit(){
  		if(StringUtils.isEmpty(rStartTime)){
  			return 1;
  		}else{
  			if(!reservationTask.equals(1)){
  				return 0;
  			}else{
  				return rStartTime.substring(0, 10).equals(Utils.getNowDate()) ? 1 : 0;
  			}
  		}
  	}
  	
	public String getDoctorPicture() {
		return doctorPicture;
	}
	public void setDoctorPicture(String doctorPicture) {
		this.doctorPicture = doctorPicture;
	}
	public Integer getMode() {
		return mode;
	}
	public void setMode(Integer mode) {
		this.mode = mode;
	}
	public String getDoctorAvgTime() {
		return doctorAvgTime;
	}
	public void setDoctorAvgTime(String doctorAvgTime) {
		this.doctorAvgTime = doctorAvgTime;
	}
	public BigDecimal getServiceCost() {
		return serviceCost;
	}
	public void setServiceCost(BigDecimal serviceCost) {
		this.serviceCost = serviceCost;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getPatientMobile() {
		return patientMobile;
	}
	public void setPatientMobile(String patientMobile) {
		this.patientMobile = patientMobile;
	}
	public String getPatientSex() {
		return patientSex;
	}
	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}
	public String getPatientBirthDate() {
		return patientBirthDate;
	}
	public void setPatientBirthDate(String patientBirthDate) {
		this.patientBirthDate = patientBirthDate;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getAddressProvince() {
		return addressProvince;
	}
	public void setAddressProvince(String addressProvince) {
		this.addressProvince = addressProvince;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	public String getAddressCountry() {
		return addressCountry;
	}
	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}
	public String getAddressRoad() {
		return addressRoad;
	}
	public void setAddressRoad(String addressRoad) {
		this.addressRoad = addressRoad;
	}
	public String getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}
	public Long getVisitId() {
		return visitId;
	}
	public void setVisitId(Long visitId) {
		this.visitId = visitId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public Integer getSpecialtyId() {
		return specialtyId;
	}
	public void setSpecialtyId(Integer specialtyId) {
		this.specialtyId = specialtyId;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public Integer getVisitType() {
		return visitType;
	}
	public void setVisitType(Integer visitType) {
		this.visitType = visitType;
	}
	public Integer getOrderState() {
		return orderState;
	}
	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Integer getTitlesClinical() {
		return titlesClinical;
	}
	public void setTitlesClinical(Integer titlesClinical) {
		this.titlesClinical = titlesClinical;
	}
	public Integer getTitlesTeach() {
		return titlesTeach;
	}
	public void setTitlesTeach(Integer titlesTeach) {
		this.titlesTeach = titlesTeach;
	}
	public String getTitlesClinicalName() {
		return this.titlesClinical == null ? "" : TitlesClinicalType.getName(this.titlesClinical);
	}
	public String getTitlesTeachName() {
		return this.titlesTeach == null ? "" : TitlesTeachType.getName(this.titlesTeach);
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getSpecialtyName() {
		return specialtyName;
	}
	public void setSpecialtyName(String specialtyName) {
		this.specialtyName = specialtyName;
	}
	public String getPayOrderCreateTime() {
		return payOrderCreateTime;
	}
	public void setPayOrderCreateTime(String payOrderCreateTime) {
		this.payOrderCreateTime = payOrderCreateTime;
	}
	public String getOrderStateName() {
		return this.orderState == null ? "" : PayOrderState.getName(this.orderState);
	}
	public String getVisitTypeName(){
		return this.visitType == null ? "" : ServiceType.getName(this.visitType);
	}
	public String getModeName(){
		return this.mode == null ? "" : this.mode.equals(0) ? "普通问诊"  : "预约问诊";
	}
	
	public Integer getPatientAge(){
		try {
			return StringUtils.isEmpty(this.patientBirthDate) ? null : Utils.getAge(this.patientBirthDate);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
}
