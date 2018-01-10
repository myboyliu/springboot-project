package com.huatuo.customer.service;

import java.util.List;

import com.huatuo.customer.domain.XtPersonFamily;
import com.huatuo.customer.request.PersonParam;
import com.huatuo.customer.request.VisitForm;

public interface PersonFamilyService {
	/**
	 * 根据当前用户id查询出对应的家庭成员列表
	 * @return
	 */
	public List<XtPersonFamily> selectFamilyListByUserId(Long userId);
	
	/**
	 * 修改一条家庭成员信息
	 * @param xtPersonFamily
	 * @return
	 */
	public Integer updatePersonFamily(XtPersonFamily xtPersonFamily);
	
	/**
	 * 查询一条家庭成员信息
	 * @return
	 */
	public XtPersonFamily selectOneFamily(Long personFamilyId);
	
	/**
	 * 查询一条家庭成员信息
	 * @return
	 */
	public XtPersonFamily selectOneFamilyById(Long personFamilyId);
	
	/**
	 *	业务订单保存时修改过家庭成员信息
	 * @param visitForm
	 * @return
	 */
	public Integer updatePersonFamilyByVisitFrom(VisitForm visitForm);
	
	/**
	 * 修改家庭成员
	 */
	public Integer updatePersonFamilyModel(PersonParam personParam);
	
	/**
	 * 删除家庭成员信息
	 */
	public Integer deletePersonFamily(Long personFamilyId);
	
	/**
	 * 增加一条家庭成员信息
	 * 并返回家庭成员对象id
	 */
	public Long insertFamily(PersonParam personParam);
	
	
}	
