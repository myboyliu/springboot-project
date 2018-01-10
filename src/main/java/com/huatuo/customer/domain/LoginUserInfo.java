package com.huatuo.customer.domain;

import java.io.Serializable;

/**
 * 用户登录信息
 * @author master
 *
 */
public class LoginUserInfo implements Serializable{
	
	private static final long serialVersionUID = -5981057012784709089L;
	
	/**
	 * 系统用户信息
	 */
	private com.huatuo.register.domain.XtUser xtUser;
	/**
	 *	系统个人信息
	 */
	private XtPerson xtPerson;
	/**
	 * 登录用户地址信息
	 */
	private XtAddress xtAddress;

	
	public com.huatuo.register.domain.XtUser getXtUser() {
		return xtUser;
	}

	public void setXtUser(com.huatuo.register.domain.XtUser xtUser) {
		this.xtUser = xtUser;
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
    
}
