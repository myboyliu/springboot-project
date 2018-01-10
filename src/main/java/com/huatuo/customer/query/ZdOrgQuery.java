package com.huatuo.customer.query;

import com.huatuo.customer.base.query.BaseQuery;

/**
 * 医院查询对象
 * @author master
 *
 */
public class ZdOrgQuery extends BaseQuery{
	
	private static final long serialVersionUID = -3641968307412543791L;
	/**
	 *	省份id
	 */
	private Integer provinceCode;
	/**
	 * 城市id
	 */
	private Integer cityCode;
	/**
	 * 医院Id
	 */
	private Integer orgId;
	/**
	 * 一级科室id
	 */
	private Integer specialtyId;
	/**
	 * 医院里面的医生列表当前页
	 */
	private Integer doctorCurrentPage;
	/**
	 * 医院里面的医生列表每页条数
	 */
	private Integer doctorPageSize;
	
	/**
	 * 省份名
	 */
	private String provinceName;
	
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public Integer getDoctorCurrentPage() {
		return doctorCurrentPage;
	}
	public void setDoctorCurrentPage(Integer doctorCurrentPage) {
		this.doctorCurrentPage = doctorCurrentPage;
	}
	public Integer getDoctorPageSize() {
		return doctorPageSize;
	}
	public void setDoctorPageSize(Integer doctorPageSize) {
		this.doctorPageSize = doctorPageSize;
	}
	public Integer getSpecialtyId() {
		return specialtyId;
	}
	public void setSpecialtyId(Integer specialtyId) {
		this.specialtyId = specialtyId;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public Integer getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(Integer provinceCode) {
		this.provinceCode = provinceCode;
	}
	public Integer getCityCode() {
		return cityCode;
	}
	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}
}
