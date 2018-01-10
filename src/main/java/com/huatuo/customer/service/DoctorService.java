package com.huatuo.customer.service;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.domain.Doctor;


/**
 * 医生管理
 * @author master
 *
 */
public interface DoctorService {
	/**
	 * 
	 * @param provinceCode 省编号
	 * @param cityCode  市编号
	 * @param countyCode 县编号
	 * @param roadCode  街道编号
	 * @param currentPage  当前页
	 * @param orgId  医院id
	 * @param option  状态
	 * @param specialtyId  所属科目
	 * @param queuingNumber  排队人数
	 * @return
	 */
	public Page<Doctor> getDoctorInfo(Integer provinceCode,Integer cityCode,Integer countyCode,Integer roadCode,Integer currentPage,Integer pageSize,Integer orgId,Integer specialtyId,Integer option,Integer queuingNumber);
	
	/**
	 * 
	 * @param provinceCode
	 * @param cityCode
	 * @param countyCode
	 * @param roadCode
	 * @param option  0:离线  1：在线  2：可预约
	 * @param specialtyId
	 * @param queuingNumber
	 * @param orgId 医院id
	 * @return
	 * 查询在线医生
	 */	
	public Page<Doctor> getOnlineDoctorInfo(Integer provinceCode, Integer cityCode,
			Integer countyCode, Integer roadCode,Integer currentPage,Integer pageSize,
			Integer orgId,Integer specialtyId,Integer option,Integer queuingNumber);
	
	/**
	 * @param provinceCode
	 * @param cityCode
	 * @param countyCode
	 * @param roadCode
	 * @param option  0:离线  1：在线  2：可预约
	 * @param specialtyId
	 * @param queuingNumber
	 * @param orgId 医院id
	 * @return
	 * 查询可预约医生
	 */	
	public Page<Doctor> getReservationDoctorInfo(Integer provinceCode, Integer cityCode,
			Integer countyCode, Integer roadCode,Integer currentPage,Integer pageSize,
			Integer orgId,Integer specialtyId,Integer option,Integer queuingNumber);
	
	
	
	/**
	 * 根据id查医生详情
	 * 
	 */
	public Doctor getDoctorDetail(Long doctorId);
	
	public Doctor selectDoctorById(Long doctorId);
	
	/**
	 * 根据专科拼接出医生专科的查询条件
	 * @param specialtyId
	 * @return
	 */
	public String getSpecialtyForSeach(Integer specialtyId);
	
	/**
	 * 预约问诊之后余号更新
	 * @param doctorId
	 */
	public void updateDoctorSubscribeNumber(Long doctorId);
}
