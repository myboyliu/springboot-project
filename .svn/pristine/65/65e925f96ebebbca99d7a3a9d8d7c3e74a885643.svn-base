package com.huatuo.customer.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.DtPackageDtlMapper;
import com.huatuo.customer.dao.DtPackageMapper;
import com.huatuo.customer.domain.DtPackage;
import com.huatuo.customer.domain.DtPackageDtl;
import com.huatuo.customer.domain.DtPackagePojo;
import com.huatuo.customer.service.DtPackageService;

@Service
public class DtPackageServiceImpl implements DtPackageService {
	
	
	@Autowired
	private DtPackageMapper dtPackageMapper;
	
	@Autowired
	private DtPackageDtlMapper dtPackageDtlMapper;

	@Override
	public DtPackagePojo getDtPackageByTeamPackageId(String teamPackageId) {
		DtPackagePojo dtPackagePojo = new DtPackagePojo();
		if(teamPackageId != null){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("teamPackageId", teamPackageId);
			//查询套餐信息
			dtPackagePojo = dtPackageMapper.getDtPackageByTeamPackageId(map);
			
			if(dtPackagePojo != null){
				//套餐子项信息
				List<DtPackageDtl> dtPackageDtls = dtPackageDtlMapper.listDtPackageDtls(map);
				dtPackagePojo.setDtPackageDtls(dtPackageDtls);
			}
		}
		
		return dtPackagePojo;
	}

	@Override
	public DtPackage selectByPrimaryKey(String teamPackageId) {
		return dtPackageMapper.selectByPrimaryKey(teamPackageId);
	} 


}
