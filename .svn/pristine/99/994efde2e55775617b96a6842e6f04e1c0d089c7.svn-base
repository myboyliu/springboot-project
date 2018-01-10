package com.huatuo.customer.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.XtCommonDiseaseMapper;
import com.huatuo.customer.dao.XtSpecialtyMapper;
import com.huatuo.customer.domain.XtCommonDisease;
import com.huatuo.customer.domain.XtCommonDiseaseCriteria;
import com.huatuo.customer.domain.XtSpecialty;
import com.huatuo.customer.domain.XtSpecialtyCriteria;
import com.huatuo.customer.service.SpecialtyService;

@Service
@Transactional
public class SpecialtyServiceImpl implements SpecialtyService{
	
    @Autowired
     private XtSpecialtyMapper specialtyMapper;
     @Autowired
     private XtCommonDiseaseMapper XtCommonDiseaseMapper;
	
	@Override
	@Cacheable(value="specialty", keyGenerator = "wiselyKeyGenerator")
	public List<XtSpecialty> getSpecialtyInfo() {		
		return specialtyMapper.selectSpecialtyInfo();
	}


	@Override
	public XtSpecialty selectSpecialtyById(Integer id) {
		return specialtyMapper.selectByPrimaryKey(id);
	}


	@Override
	public List<XtSpecialty> querySpecialtyList() {
		XtSpecialtyCriteria example =new XtSpecialtyCriteria();
		example.createCriteria().andOpenFlagEqualTo(0);
		return specialtyMapper.selectByExample(example);
	}


	@Override
	public List<XtCommonDisease> queryDiseaseList(String specialtyId) {
		XtCommonDiseaseCriteria example=new XtCommonDiseaseCriteria();
		example.createCriteria().andSpecialtyIdEqualTo(specialtyId);
		return XtCommonDiseaseMapper.selectByExample(example);
	}


	@Override
	public List<Integer> createSpecialtyIds(List<XtSpecialty> list) {
		List<Integer> returnLists = new ArrayList<Integer>();
		for (XtSpecialty xtSpecialty : list) {
			returnLists.add(xtSpecialty.getId());
		}
		return returnLists;
	}

}
