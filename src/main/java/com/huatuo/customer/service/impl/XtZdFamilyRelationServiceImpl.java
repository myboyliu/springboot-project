package com.huatuo.customer.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.XtZdFamilyRelationMapper;
import com.huatuo.customer.domain.XtZdFamilyRelation;
import com.huatuo.customer.service.XtZdFamilyRelationService;

@Service
@Transactional
public class XtZdFamilyRelationServiceImpl implements XtZdFamilyRelationService{

	@Autowired
	private XtZdFamilyRelationMapper xtZdFamilyRelationMapper;
	
	@Override
	@Cacheable(value="familyRelation", keyGenerator = "wiselyKeyGenerator")
	public List<XtZdFamilyRelation> getFamilyRelationList() {
		
		return xtZdFamilyRelationMapper.selectFamilyRelation();
	}

}
