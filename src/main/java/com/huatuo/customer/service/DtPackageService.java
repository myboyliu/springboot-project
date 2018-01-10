package com.huatuo.customer.service;

import com.huatuo.customer.domain.DtPackage;
import com.huatuo.customer.domain.DtPackagePojo;


public interface DtPackageService {

	/**
	 * 查询套餐信息
	 * @param teamPackageId  套餐id
	 * @return
	 */
	DtPackagePojo getDtPackageByTeamPackageId(String teamPackageId);
	
	/**
	 * 根据主键查询医生套餐基本信息
	 * @param teamPackageId
	 * @return
	 */
	DtPackage selectByPrimaryKey(String teamPackageId);
	
}
