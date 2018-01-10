package com.huatuo.customer.response;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.Doctor;
import com.huatuo.customer.domain.MzPatient;
import com.huatuo.customer.domain.MzVisit;
import com.huatuo.customer.domain.OrderResult;

/**
 * 订单返回结果对象
 * @author master
 *
 */
public class OrderResponse extends BaseResponse{

	private static final long serialVersionUID = 2053148426753602321L;
	/**
	 * 分页查询结果
	 */
	private Page<OrderResult> page;
	/**
	 * 订单详情
	 */
	private OrderResult orderResult;
	/**
	 * 医生信息详情
	 */
	private Doctor doctor;
	/**
	 * 患者信息
	 */
	private MzPatient patient;
	/**
	 * 业务订单id
	 */
	private Long visitId;

	/**
	 * 业务订单对象
	 */
	private MzVisit mzVisit;
	
	public MzVisit getMzVisit() {
		return mzVisit;
	}

	public void setMzVisit(MzVisit mzVisit) {
		this.mzVisit = mzVisit;
	}

	public Long getVisitId() {
		return visitId;
	}

	public void setVisitId(Long visitId) {
		this.visitId = visitId;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public MzPatient getPatient() {
		return patient;
	}

	public void setPatient(MzPatient patient) {
		this.patient = patient;
	}

	public OrderResult getOrderResult() {
		return orderResult;
	}

	public void setOrderResult(OrderResult orderResult) {
		this.orderResult = orderResult;
	}

	public Page<OrderResult> getPage() {
		return page;
	}

	public void setPage(Page<OrderResult> page) {
		this.page = page;
	}
	
}
