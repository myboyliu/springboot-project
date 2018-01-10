package com.huatuo.customer.response;

import java.util.ArrayList;
import java.util.List;

import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.XtAddress;
import com.huatuo.customer.domain.XtZdDistrict;

/**
 * 地区返回对象
 * @author master
 *
 */
public class AddressResponse extends BaseResponse{

	private static final long serialVersionUID = 184829326126432250L;
	
	/**
	 * 区域信息
	 */
	private List<XtZdDistrict> lists = new ArrayList<XtZdDistrict>();
	
	/**
	 * 地址信息 
	 */
	private XtAddress address;

	public List<XtZdDistrict> getLists() {
		return lists;
	}

	public void setLists(List<XtZdDistrict> lists) {
		this.lists = lists;
	}

	public XtAddress getAddress() {
		return address;
	}

	public void setAddress(XtAddress address) {
		this.address = address;
	}
	
}
