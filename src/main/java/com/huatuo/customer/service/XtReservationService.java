package com.huatuo.customer.service;

import java.text.ParseException;
import java.util.List;

import com.huatuo.customer.domain.XtReservation;
import com.huatuo.customer.query.ReservationQuery;

/**
 * 医生服务设置
 * @author master
 *
 */
public interface XtReservationService {
	
	/**
	 * 查询出医生预约服务设置以及计算出余号数
	 * @param reservationQuery
	 * @return
	 * @throws ParseException 
	 * @throws Exception 
	 */
	public List<XtReservation> selectReservationsByDoctorUid(ReservationQuery reservationQuery) throws ParseException, Exception;
	
}
