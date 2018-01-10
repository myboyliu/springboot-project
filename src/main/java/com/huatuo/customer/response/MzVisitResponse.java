package com.huatuo.customer.response;

import java.math.BigDecimal;

import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.Doctor;
import com.huatuo.customer.domain.MzVisit;

/**
 * 业务订单返回对象
 * @author master
 *
 */
public class MzVisitResponse extends BaseResponse{

	private static final long serialVersionUID = 470899492613482066L;
	/**
	 * 医生信息
	 */
	private Doctor doctor;
	/**
	 * 业务订单对象
	 */
	private MzVisit mzVisit;
	/**
	 * 订单号
	 */
	private String orderNo;
	/**
	 * 支付金额
	 */
	private BigDecimal servicePrice;
	/**
	 * 医院名称
	 */
	private String orgName;
	/**
	 * 专科名称
	 */
	private String specialtyName;
	/**
	 * 特殊业务码
	 * 1、订单已生成但是未支付
	 * 2、订单已支付处于待服务或者服务中
	 */
	private Integer specialServiceCode;
	
	/**
	 * 医生团队是否已失效
	 * 1，未失效，2失效
	 */
	private Integer dtPackageIsDel;
	
	public Integer getDtPackageIsDel() {
		return dtPackageIsDel;
	}
	public void setDtPackageIsDel(Integer dtPackageIsDel) {
		this.dtPackageIsDel = dtPackageIsDel;
	}
	public Integer getSpecialServiceCode() {
		return specialServiceCode;
	}
	public void setSpecialServiceCode(Integer specialServiceCode) {
		this.specialServiceCode = specialServiceCode;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public MzVisit getMzVisit() {
		return mzVisit;
	}
	public void setMzVisit(MzVisit mzVisit) {
		this.mzVisit = mzVisit;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public BigDecimal getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(BigDecimal servicePrice) {
		this.servicePrice = servicePrice;
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
		
	
}
