package com.huatuo.customer.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.XtZdOccupationMapper;
import com.huatuo.customer.domain.XtZdOccupation;
import com.huatuo.customer.service.XtZdOccupationService;

@Service
@Transactional
public class XtZdOccupationServiceImpl implements XtZdOccupationService{

	@Autowired
	private XtZdOccupationMapper xtZdOccupationMapper;
	
	@Override
	@Cacheable(value="occupation", keyGenerator = "wiselyKeyGenerator")
	public List<XtZdOccupation> getOccupationList() {
		return xtZdOccupationMapper.selectXtZdOccupation();
	}

}
