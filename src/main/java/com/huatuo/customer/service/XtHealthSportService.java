package com.huatuo.customer.service;


import com.huatuo.customer.domain.XtHealthSport;

public interface XtHealthSportService {
	
	/**
	 * 获取登陆时间用户当前时间运动的信息
	 */
	public XtHealthSport getHealthSportByUserId(Long userId);
	
	/**
	 * 保存运动信息
	 * @param sport
	 * @return
	 */
	public int save(XtHealthSport sport);

}
