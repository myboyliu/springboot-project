package com.huatuo.customer.service;

import java.util.List;

import com.huatuo.customer.domain.XtCommonDisease;
import com.huatuo.customer.domain.XtSpecialty;

public interface SpecialtyService {
	/**
	 * 获取所有一级科室信息
	 * @return
	 */
	public List<XtSpecialty> getSpecialtyInfo();

	/**
	 * 根据id查询出一条专科信息
	 */
	public XtSpecialty selectSpecialtyById(Integer id);
	
	/**
	 * 获取科室名称
	 * @return
	 */
	public List<XtSpecialty> querySpecialtyList();
	
	/**
	 * 根据科室id查询科室下面的常见疾病
	 * @param id
	 * @return
	 */
	public List<XtCommonDisease> queryDiseaseList(String specialtyId);
	
	/**
	 * 封装专科id到列表
	 * @param list
	 * @return
	 */
	public List<Integer> createSpecialtyIds(List<XtSpecialty> list);
}
