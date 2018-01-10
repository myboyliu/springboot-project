package com.huatuo.customer.query;

import com.huatuo.customer.base.query.BaseQuery;

/**
 * 医院查询对象
 * @author master
 *
 */
public class DoctorQuery extends BaseQuery{
	
	private static final long serialVersionUID = -7856106247662254280L;
	/**
	 *	省份id
	 */
	private Integer provinceCode;
	/**
	 * 城市id
	 */
	private Integer cityCode;
	/**
	 *  县id
	 */
	private Integer countryCode;
	
	/**
	 * 街道
	 */
	private Integer roadCode;
	
	/**
	 * 状态
	 */
	private Integer option;
	
	/**
	 * 排队人数  1：由多到少  2：由少到多
	 */
	private Integer queuingNumber;
	
	/**
	 * 医院Id
	 */
	private Integer orgId;
	
	/**
	 * 一级科室id
	 */
    private Integer specialtyId;
    
    /**
     * 医生id
     * @return
     */
    private Long doctorId;
    
    /**
     * 当前页
     */
    private Integer currentPage;

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
	
	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}

	public Integer getRoadCode() {
		return roadCode;
	}

	public void setRoadCode(Integer roadCode) {
		this.roadCode = roadCode;
	}

	public Integer getOption() {
		return option;
	}

	public void setOption(Integer option) {
		this.option = option;
	}

	public Integer getQueuingNumber() {
		return queuingNumber;
	}

	public void setQueuingNumber(Integer queuingNumber) {
		this.queuingNumber = queuingNumber;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public Integer getSpecialtyId() {
		return specialtyId;
	}

	public void setSpecialtyId(Integer specialtyId) {
		this.specialtyId = specialtyId;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
}
