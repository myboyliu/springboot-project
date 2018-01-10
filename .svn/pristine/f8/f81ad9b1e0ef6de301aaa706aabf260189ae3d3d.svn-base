package com.huatuo.customer.response;

import java.util.List;
import java.util.Map;

import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.XtAddress;
import com.huatuo.customer.domain.XtPersonFamily;
import com.huatuo.customer.domain.XtZdFamilyRelation;
import com.huatuo.customer.domain.XtZdOccupation;

public class PersonFamilyResponse extends BaseResponse{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 返回某个家庭成员信息
	 */
	private XtPersonFamily xtPersonFamily;
	
	/**
	 * 用户家庭成员返回信息
	 */
	private List<XtPersonFamily> XtPersonFamilyList;
	
	/**
	 * 返回所有成员关系信息
	 */
	private List<XtZdFamilyRelation> familyRelationList;
	
	/**
	 * 返回所有职业信息
	 * @return
	 */
	private List<XtZdOccupation> occupationList;
	
	/**
	 * 返回地区
	 * @return
	 */
	private List<Map<String, Object>>  addressList; 

	/**
	 * 家庭成员的地址对象
	 */
	private XtAddress xtAddress;
	/**
	 * 家庭成员对象id
	 */
	private Long personFamilyId;
	
	public Long getPersonFamilyId() {
		return personFamilyId;
	}

	public void setPersonFamilyId(Long personFamilyId) {
		this.personFamilyId = personFamilyId;
	}

	public XtAddress getXtAddress() {
		return xtAddress;
	}

	public void setXtAddress(XtAddress xtAddress) {
		this.xtAddress = xtAddress;
	}

	public XtPersonFamily getXtPersonFamily() {
		return xtPersonFamily;
	}

	public void setXtPersonFamily(XtPersonFamily xtPersonFamily) {
		this.xtPersonFamily = xtPersonFamily;
	}

	public List<XtPersonFamily> getXtPersonFamilyList() {
		return XtPersonFamilyList;
	}

	public void setXtPersonFamilyList(List<XtPersonFamily> xtPersonFamilyList) {
		XtPersonFamilyList = xtPersonFamilyList;
	}

	public List<XtZdOccupation> getOccupationList() {
		return occupationList;
	}

	public void setOccupationList(List<XtZdOccupation> occupationList) {
		this.occupationList = occupationList;
	}

	public List<XtZdFamilyRelation> getFamilyRelationList() {
		return familyRelationList;
	}

	public void setFamilyRelationList(List<XtZdFamilyRelation> familyRelationList) {
		this.familyRelationList = familyRelationList;
	}

	public List<Map<String, Object>> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Map<String, Object>> addressList) {
		this.addressList = addressList;
	}
	
	
	
}
