package com.huatuo.customer.dao;

import java.util.List;
import java.util.Map;

import com.huatuo.customer.domain.Doctor;

public interface DoctorMapper {
	public List<Doctor> selectAllDoctors();
	
	public List<Doctor> selectDoctorInfo(Map<String,Object> param);
	
	public Doctor selectDoctorDetailById(Map<String,Object> param);
	
	public int count(Map<String,Object> param);
	
	public Doctor selectDoctorById(Long doctorId);

	/**
	 * 查询出团队医生成员信息
	 * @param map
	 * @return
	 */
	public List<Doctor> listDoctorsByDtTeamId(Map<String, Object> map);
}
