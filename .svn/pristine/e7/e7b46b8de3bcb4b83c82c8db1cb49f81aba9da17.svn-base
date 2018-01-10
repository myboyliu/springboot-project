package com.huatuo.customer.response;

import java.util.List;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.DtTeam;
import com.huatuo.customer.domain.XtHealthCenter;
import com.huatuo.customer.domain.XtHealthCenterPojo;
import com.huatuo.customer.domain.XtHealthSport;
import com.huatuo.customer.domain.XtPersonFamily;
import com.huatuo.customer.domain.XtUser;

public class HealthCenterResponse extends BaseResponse{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户信息
	 */
    private XtUser xtUser;
    
    /**
     * 用户家庭成员信息
     */
    private List<XtPersonFamily> xtPersonFamilyList;
    
    /**
     * 查询个人运动信息
     */
    private XtHealthSport healthSport;
    
    /**
     * 分页信息
     */
    private Page<DtTeam> page;
    
    /**
     * 健康中心返回信息
     */
    List<XtHealthCenter> healthCenter;   
    
    
    /**
     * 返回一周内的日期
     */
    private String[] dateArr;
    
    /**
     * 返回一个月内各个状态统计次数
     */
    private  List<XtHealthCenterPojo> xtHealthCenterPojoList;
    
	public XtUser getXtUser() {
		return xtUser;
	}

	public void setXtUser(XtUser xtUser) {
		this.xtUser = xtUser;
	}
	
	public List<XtPersonFamily> getXtPersonFamilyList() {
		return xtPersonFamilyList;
	}

	public void setXtPersonFamilyList(List<XtPersonFamily> xtPersonFamilyList) {
		this.xtPersonFamilyList = xtPersonFamilyList;
	}

	public XtHealthSport getHealthSport() {
		return healthSport;
	}

	public void setHealthSport(XtHealthSport healthSport) {
		this.healthSport = healthSport;
	}

	public Page<DtTeam> getPage() {
		return page;
	}

	public void setPage(Page<DtTeam> page) {
		this.page = page;
	}

	public List<XtHealthCenter> getHealthCenter() {
		return healthCenter;
	}

	public void setHealthCenter(List<XtHealthCenter> healthCenter) {
		this.healthCenter = healthCenter;
	}

	public List<XtHealthCenterPojo> getXtHealthCenterPojoList() {
		return xtHealthCenterPojoList;
	}

	public void setXtHealthCenterPojoList(
			List<XtHealthCenterPojo> xtHealthCenterPojoList) {
		this.xtHealthCenterPojoList = xtHealthCenterPojoList;
	}

	public String[] getDateArr() {
		return dateArr;
	}

	public void setDateArr(String[] dateArr) {
		this.dateArr = dateArr;
	}

}
