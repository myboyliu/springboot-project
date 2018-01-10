package com.huatuo.customer.response;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.Doctor;
import com.huatuo.customer.domain.XtAddress;

/**
 * 医生返回相关信息
 * @author tangxiangqian
 *
 */
public class DoctorResponse extends BaseResponse{

	private static final long serialVersionUID = 5502444291038809854L;

	/**
	 * 医生分页对象
	 */
	private Page<Doctor> page;
	
	/**
	 * 医生详情
	 */
	private Doctor doctor;
	
	/**
	 * 登录用户地址信息
	 * 
	 */
	private XtAddress xtAddress;

	public Page<Doctor> getPage() {
		return page;
	}

	public void setPage(Page<Doctor> page) {
		this.page = page;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public XtAddress getXtAddress() {
		return xtAddress;
	}

	public void setXtAddress(XtAddress xtAddress) {
		this.xtAddress = xtAddress;
	}
	
	
}
