package com.huatuo.customer.dao;

import java.util.List;
import java.util.Map;

import com.huatuo.customer.domain.ZdOrg;
import com.huatuo.customer.query.ZdOrgQuery;

public interface ZdOrgMapper {
	
	/**
	 * 查询医院列表
	 * @param zdOrgQuery
	 * @return
	 */
	public List<ZdOrg> seachOrgList(ZdOrgQuery zdOrgQuery);
	
	/**
	 * 查询医院数量
	 * @param zdOrgQuery
	 * @return
	 */
	public Integer seachOrgCount(ZdOrgQuery zdOrgQuery);
	
	/**
	 * 根绝id查询出对应的医院信息
	 * @param zdOrgQuery
	 * @return
	 */
	public ZdOrg selectOrgDetailsById(ZdOrgQuery zdOrgQuery);
	
	/**
	 * 查询医院下医生个数
	 * @param zdOrgQuery
	 * @return
	 */
	public Integer selectDoctorCountByOrgId(ZdOrgQuery zdOrgQuery);
	
	/**
	 * 查询医院下专家个数
	 * @param zdOrgQuery
	 * @return
	 */
	public Integer selectDoctorCountForSpecialist(ZdOrgQuery zdOrgQuery);
	/**
	 * 根据id查询医院信息
	 * @param orgId
	 * @return
	 */
	public ZdOrg selectOrgByOrgId(Integer orgId);

	/**
	 * 查询机构集合
	 * @param map
	 * @return
	 */
	public List<Integer> listOrgs(Map<String, Object> map);
	
	/**
	 * 根据省份id查询医院
	 * @param provinceCode
	 * @return
	 */
	public List<ZdOrg> selectOrgListByLocationData(Integer provinceCode);
}
