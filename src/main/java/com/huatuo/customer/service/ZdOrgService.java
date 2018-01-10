package com.huatuo.customer.service;

import java.util.List;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.domain.ZdOrg;
import com.huatuo.customer.query.ZdOrgQuery;

/**
 * 医院操作
 * @author master
 *
 */
public interface ZdOrgService{
	/**
	 *	分页查找医院
	 * @param zdOrgQuery
	 * @return
	 */
	public Page<ZdOrg> selectOrgsByPage(ZdOrgQuery zdOrgQuery);
	
	/**
	 * 根据医院id查询出对应医院信息
	 * @param zdOrgQuery
	 * @return
	 */
	public ZdOrg selectOrgDetailsById(ZdOrgQuery zdOrgQuery);
	
	/**
	 * 根据省份id查询医院
	 * @param provinceCode
	 * @return
	 */
	public List<ZdOrg> selectOrgListByLocationData(Integer provinceCode);
}
