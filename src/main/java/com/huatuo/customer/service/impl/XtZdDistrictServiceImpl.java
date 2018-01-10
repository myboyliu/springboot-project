package com.huatuo.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.XtZdDistrictMapper;
import com.huatuo.customer.domain.XtZdDistrict;
import com.huatuo.customer.service.XtZdDistrictService;

@Service
public class XtZdDistrictServiceImpl implements XtZdDistrictService{

	@Autowired
	private XtZdDistrictMapper xtZdDistrictMapper;
	
	@Override
	public XtZdDistrict selectDistrictByLocationData(String provinceName) {
		return xtZdDistrictMapper.selectDistrictByLocationData(provinceName);
	}

}
