package com.huatuo.customer.query;

import com.huatuo.customer.base.query.BaseQuery;


/**
 * 医生服务设置查询对象
 * @author master
 *
 */
public class ReservationQuery extends BaseQuery{

	private static final long serialVersionUID = 3548806295914170262L;
	
	/**
	 * 医生的用户id
	 */
	private Long doctorUid;

	public Long getDoctorUid() {
		return doctorUid;
	}

	public void setDoctorUid(Long doctorUid) {
		this.doctorUid = doctorUid;
	}
	
}
