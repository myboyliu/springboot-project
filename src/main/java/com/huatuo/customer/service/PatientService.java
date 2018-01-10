package com.huatuo.customer.service;

import java.util.List;

import com.huatuo.customer.domain.MzPatient;
import com.huatuo.customer.request.VisitForm;

/*
 * 患者业务
 */
public interface PatientService {
	
	/**
	 * 增加一条患者信息
	 */
	public MzPatient savePatientByVisitForm(VisitForm visitForm);
	
	/**
	 * 查询一条患者信息
	 * @param patientId
	 * @return
	 */
	public MzPatient selectPatientById(Long patientId);

	/**
	 * 查询一条患者信息且关联详细地址
	 * @param id
	 * @return
	 */
	public MzPatient selectPatientAndAddressDetail(Long id);
	/**
	 * 根据登录用户查询患者列表
	 * @param userId
	 * @return
	 */
	public List<MzPatient> getPatientListByUserId(String userId);
}
