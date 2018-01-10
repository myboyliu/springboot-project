package com.huatuo.customer.response;

import java.util.ArrayList;
import java.util.List;

import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.XtPersonFamily;
import com.huatuo.customer.domain.XtZdOccupation;
import com.huatuo.register.domain.XtAddress;
import com.huatuo.register.domain.XtPerson;

/**
 *	个人信息返回对象
 * @author master
 *
 */
public class PersonResponse extends BaseResponse{

	private static final long serialVersionUID = 1234122004334724119L;

	/**
	 * 家庭成员关系列表
	 */
	private List<XtPersonFamily> familyList = new ArrayList<XtPersonFamily>();

	/**
	 * 家庭成员单个对象
	 */
	private XtPersonFamily xtPersonFamily;
	
	/**
	 * 用户个人信息对象
	 */
	private XtPerson xtPerson;
	
	/**
	 * 用户个人地址对象
	 */
	private XtAddress xtAddress;
	
	/**
	 * 职业列表
	 */
	private List<XtZdOccupation> occupations = new ArrayList<XtZdOccupation>();
	
	public List<XtZdOccupation> getOccupations() {
		return occupations;
	}

	public void setOccupations(List<XtZdOccupation> occupations) {
		this.occupations = occupations;
	}

	public XtPerson getXtPerson() {
		return xtPerson;
	}

	public void setXtPerson(XtPerson xtPerson) {
		this.xtPerson = xtPerson;
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

	public List<XtPersonFamily> getFamilyList() {
		return familyList;
	}

	public void setFamilyList(List<XtPersonFamily> familyList) {
		this.familyList = familyList;
	}
	
}
