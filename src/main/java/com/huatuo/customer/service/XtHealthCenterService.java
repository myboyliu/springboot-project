package com.huatuo.customer.service;

import java.util.List;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.domain.XtHealthCenter;
import com.huatuo.customer.domain.XtHealthCenterHistory;
import com.huatuo.customer.domain.XtHealthCenterPojo;
import com.huatuo.customer.query.HealthCenterQuery;

public interface XtHealthCenterService {
	public List<XtHealthCenter> getXtHealthCenterList(String userId,Long type,Integer dateFlag);
	
	/**
     * 统计各个类型当前月 测试次数
     */
    List<XtHealthCenterPojo> countInMonth(String userId,Long type,Integer dateFlag);
	
	
	/**
	 * 保存健康信息
	 * @param healthCenter
	 * @return
	 */
	public int saveHealth(XtHealthCenter healthCenter);
	
	/**
	 * 查询历史记录
	 * 
	 * @param healthCenterQuery
	 * @return
	 * @author lshaci
	 * @createTime 2016年11月1日 上午10:28:26
	 * @modifyTime 2016年11月1日 上午10:28:26
	 */
	Page<XtHealthCenterHistory> getHistory(HealthCenterQuery healthCenterQuery);
	
	/**
	 * 测量次数统计
	 * 
	 * @param healthCenterQuery
	 * @return
	 * @author lshaci
	 * @createTime 2016年11月1日 下午1:45:45
	 * @modifyTime 2016年11月1日 下午1:45:45
	 */
	List<?> getStatistics(HealthCenterQuery healthCenterQuery);

	/**
	 * 查询当天血糖测量过的时间
	 * 
	 * @param healthCenterQuery
	 * @return
	 * @author lshaci
	 * @createTime 2016年11月3日 上午10:03:59
	 * @modifyTime 2016年11月3日 上午10:03:59
	 */
	List<String> getBsRecord(HealthCenterQuery healthCenterQuery);

}
