package com.huatuo.customer.response;

import java.util.List;
import java.util.Map;

import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.XtPersonFamily;
import com.huatuo.customer.domain.XtUser;
import com.huatuo.customer.domain.XtZdFamilyRelation;
import com.huatuo.customer.domain.XtZdOccupation;



public class UserResponse extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户返回信息
	 */
	private XtUser user;
	
	/**
	 * 返回某个家庭成员信息
	 */
	private XtPersonFamily xtPersonFamily;
	
	/**
	 * 用户家庭成员返回信息
	 */
	private List<XtPersonFamily> XtPersonFamilyList;
	
	/**
	 * 初始化职业
	 */
	private List<XtZdOccupation> occupationList;
	/**
	 * 初始化地区（省份）
	 */
	private List<Map<String, Object>>  addressList;
	
	/**
	 * 初始化成员关系
	 */
	private List<XtZdFamilyRelation> familyRelationList;
	
	/**
	 * 返回家庭成员id
	 */
	private Long personFamilyId;

	public XtUser getUser() {
		return user;
	}

	public void setUser(XtUser user) {
		this.user = user;
	}

	public List<XtPersonFamily> getXtPersonFamilyList() {
		return XtPersonFamilyList;
	}

	public void setXtPersonFamilyList(List<XtPersonFamily> xtPersonFamilyList) {
		XtPersonFamilyList = xtPersonFamilyList;
	}

	public XtPersonFamily getXtPersonFamily() {
		return xtPersonFamily;
	}

	public void setXtPersonFamily(XtPersonFamily xtPersonFamily) {
		this.xtPersonFamily = xtPersonFamily;
	}

	public List<XtZdOccupation> getOccupationList() {
		return occupationList;
	}

	public void setOccupationList(List<XtZdOccupation> occupationList) {
		this.occupationList = occupationList;
	}

	public List<Map<String, Object>> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Map<String, Object>> addressList) {
		this.addressList = addressList;
	}

	public List<XtZdFamilyRelation> getFamilyRelationList() {
		return familyRelationList;
	}

	public void setFamilyRelationList(List<XtZdFamilyRelation> familyRelationList) {
		this.familyRelationList = familyRelationList;
	}

	public Long getPersonFamilyId() {
		return personFamilyId;
	}

	public void setPersonFamilyId(Long personFamilyId) {
		this.personFamilyId = personFamilyId;
	}

}
