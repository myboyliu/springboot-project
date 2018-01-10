package com.huatuo.customer.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.dao.ZdOrgMapper;
import com.huatuo.customer.domain.ZdOrg;
import com.huatuo.customer.query.ZdOrgQuery;
import com.huatuo.customer.service.ZdOrgService;

@Service
@Transactional
public class  ZdOrgServiceImpl implements ZdOrgService{

	@Autowired
	private ZdOrgMapper zdOrgMapper;
	
	@Override
	public Page<ZdOrg> selectOrgsByPage(ZdOrgQuery zdOrgQuery) {
		Integer count = zdOrgMapper.seachOrgCount(zdOrgQuery);
		if(count > 0){
			Page<ZdOrg> page = new Page<ZdOrg>(count, zdOrgQuery.getCurrentPage(), zdOrgQuery.getPageSize());
			zdOrgQuery.setStart(page.getStart());
			List<ZdOrg> list = zdOrgMapper.seachOrgList(zdOrgQuery);
			for (ZdOrg zdOrg : list) {
				zdOrgQuery.setOrgId(zdOrg.getId());
				zdOrg.setDoctorCount(zdOrgMapper.selectDoctorCountByOrgId(zdOrgQuery));
				zdOrg.setSpecialistCount(zdOrgMapper.selectDoctorCountForSpecialist(zdOrgQuery));
			}
			page.setList(list);
			return page;
		}
		return null;
	}

	@Override
	public ZdOrg selectOrgDetailsById(ZdOrgQuery zdOrgQuery) {
		if(zdOrgQuery.getOrgId() == null){
			throw new RuntimeException("医院id为空");
		}
		return zdOrgMapper.selectOrgDetailsById(zdOrgQuery);
	}

	@Override
	public List<ZdOrg> selectOrgListByLocationData(Integer provinceCode) {
		List<ZdOrg> list = zdOrgMapper.selectOrgListByLocationData(provinceCode);
		ZdOrgQuery zdOrgQuery = new ZdOrgQuery();
		for (ZdOrg xtZdOrg : list) {
			zdOrgQuery.setOrgId(xtZdOrg.getId());
			xtZdOrg.setDoctorCount(zdOrgMapper.selectDoctorCountByOrgId(zdOrgQuery));
			xtZdOrg.setSpecialistCount(zdOrgMapper.selectDoctorCountForSpecialist(zdOrgQuery));
		}
		return list;
	}

}
