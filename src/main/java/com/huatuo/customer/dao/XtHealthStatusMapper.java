package com.huatuo.customer.dao;

import com.huatuo.customer.domain.XtHealthStatus;
import com.huatuo.customer.query.HealthStatusQuery;

public interface XtHealthStatusMapper {
    int insert(XtHealthStatus record);

    int insertSelective(XtHealthStatus record);

    /**
	 * 根据HealthStatusQuery查询 HealthStatus
	 * 
	 * @param query		HealthStatus查询对象
	 * @return
	 * @author lshaci
	 * @createTime 2016年10月31日 上午11:41:26
	 * @modifyTime 2016年10月31日 上午11:41:26
	 */
	XtHealthStatus getHealthStatus(HealthStatusQuery query);
}