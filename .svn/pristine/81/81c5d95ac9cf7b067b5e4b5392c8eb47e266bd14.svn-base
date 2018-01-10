package com.huatuo.customer.response;

import java.util.ArrayList;
import java.util.List;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.Doctor;
import com.huatuo.customer.domain.ZdOrg;

/**
 * 医院相关信息返回对象
 * @author master
 *
 */
public class ZdOrgResponse extends BaseResponse{
	
	private static final long serialVersionUID = -6493995334903959785L;
	/**
	 * 医院分页对象
	 */
	private Page<ZdOrg> page;
	/**
	 * 医院详情
	 */
	private ZdOrg zdOrg;
	
	/**
	 * 医生分页对象
	 * @return
	 */
	private Page<Doctor> doctorPage;
	
	/**
	 * 医院未分页列表
	 */
	private List<ZdOrg> list = new ArrayList<ZdOrg>();
	
	public List<ZdOrg> getList() {
		return list;
	}

	public void setList(List<ZdOrg> list) {
		this.list = list;
	}

	public Page<Doctor> getDoctorPage() {
		return doctorPage;
	}

	public void setDoctorPage(Page<Doctor> doctorPage) {
		this.doctorPage = doctorPage;
	}

	public ZdOrg getZdOrg() {
		return zdOrg;
	}

	public void setZdOrg(ZdOrg zdOrg) {
		this.zdOrg = zdOrg;
	}

	public Page<ZdOrg> getPage() {
		return page;
	}

	public void setPage(Page<ZdOrg> page) {
		this.page = page;
	}
}
