package com.huatuo.customer.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.huatuo.customer.dao.XtHealthStatusMapper;
import com.huatuo.customer.domain.XtHealthStatus;
import com.huatuo.customer.query.HealthStatusQuery;
import com.huatuo.customer.service.XtHealthStatusService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class XtHealthStatusServiceImpl implements XtHealthStatusService{
	
	@Autowired
	private XtHealthStatusMapper xtHealthStatusMapper;

	@Override
	public XtHealthStatus getHealthStatus(HealthStatusQuery query) {
		return xtHealthStatusMapper.getHealthStatus(query);
	}

}
