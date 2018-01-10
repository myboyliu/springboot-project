package com.huatuo.customer.dao;

import java.util.List;
import java.util.Map;

import com.huatuo.customer.domain.XtHealthCenter;
import com.huatuo.customer.domain.XtHealthCenterHistory;
import com.huatuo.customer.domain.XtHealthCenterPojo;
import com.huatuo.customer.query.HealthCenterQuery;


public interface XtHealthCenterMapper {
    int deleteByPrimaryKey(String id);

    int insert(XtHealthCenter record);
    
    int save(XtHealthCenter record);

    int insertSelective(XtHealthCenter record);

    XtHealthCenter selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(XtHealthCenter record);

    int updateByPrimaryKey(XtHealthCenter record);
    
    /**
     * 统计各个类型月周日数据
     * @param map
     * @return
     */
    List<XtHealthCenter> selectXtHealthCenterList(Map<String,Object> map);
    
    /**
     * 统计各个类型当前月 测试次数
     */
    List<XtHealthCenterPojo> countInMonth(Map<String,Object> map);
    
    
    /**
     * 统计历史记录条数
     * 
     * @param healthCenterQuery
     * @return
     * @author lshaci
     * @createTime 2016年11月1日 上午10:33:30
     * @modifyTime 2016年11月1日 上午10:33:30
     */
	int countHistory(HealthCenterQuery healthCenterQuery);

	/**
	 * 获取历史记录
	 * 
	 * @param healthCenterQuery
	 * @return
	 * @author lshaci
	 * @createTime 2016年11月1日 上午10:33:43
	 * @modifyTime 2016年11月1日 上午10:33:43
	 */
	List<XtHealthCenterHistory> getHistory(HealthCenterQuery healthCenterQuery);

	/**
	 * 测量次数统计
	 * 
	 * @param healthCenterQuery
	 * @return
	 * @author lshaci
	 * @createTime 2016年11月1日 下午1:56:27
	 * @modifyTime 2016年11月1日 下午1:56:27
	 */
	List<Map<String, Object>> getStatistics(HealthCenterQuery healthCenterQuery);

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