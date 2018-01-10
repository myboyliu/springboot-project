package com.huatuo.customer.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.DoctorMapper;
import com.huatuo.customer.dao.MzPatientMapper;
import com.huatuo.customer.dao.MzVisitMapper;
import com.huatuo.customer.dao.XtPersonFamilyMapper;
import com.huatuo.customer.dao.XtPersonMapper;
import com.huatuo.customer.domain.Doctor;
import com.huatuo.customer.domain.MzPatient;
import com.huatuo.customer.domain.MzVisit;
import com.huatuo.customer.domain.XtPerson;
import com.huatuo.customer.domain.XtPersonFamily;
import com.huatuo.customer.request.VisitForm;
import com.huatuo.customer.service.PatientService;

@Service
@Transactional
public class PatientServiceImpl implements PatientService{

	@Autowired
	private MzPatientMapper mzPatientMapper;
	
	@Autowired
	private MzVisitMapper mzVisitMapper;
	
	@Autowired
	private DoctorMapper doctorMapper;
	
	@Autowired
	private XtPersonMapper xtPersonMapper;
	
	@Autowired
	private XtPersonFamilyMapper xtPersonFamilyMapper;
	
	@Override
	public MzPatient savePatientByVisitForm(VisitForm visitForm) {
		/**
		 * 实际保存的患者信息对象
		 */
		MzPatient mzPatient = null;
		
		XtPerson xtPerson = null;
		
		XtPersonFamily xtPersonFamily = null;
		/**
		 * 先判断是否本人看病
		 * 确定患者信息从个人信息里面取
		 * 还是从家庭成员信息取
		 */
		if(visitForm.getSelfFlag().equals(0)){
			xtPerson = xtPersonMapper.selectPersonByUserId(visitForm.getUserId());
			mzPatient = mzPatientMapper.selectByPrimaryKey(xtPerson.getPatientId());
		}else{
			xtPersonFamily = xtPersonFamilyMapper.selectByPrimaryKey(visitForm.getMemberId());
			mzPatient = mzPatientMapper.selectByPrimaryKey(xtPersonFamily.getPatientId());
		}
		if(mzPatient == null){
			mzPatient = new MzPatient();
		}
		mzPatient.setName(visitForm.getPatientName());
		mzPatient.setSex(visitForm.getSex());
		mzPatient.setBirthDate(visitForm.getBirthdate());
		mzPatient.setAddressId(visitForm.getAddressId());
		mzPatient.setRelateTel(visitForm.getMobile());
		mzPatient.setSocialId(visitForm.getSocialId());
		mzPatient.setDoctorId(visitForm.getDoctorId());
		mzPatient.setAllergicHistory(visitForm.getAllergicHistory());
		mzPatient.setMarry(0);
		mzPatient.setSocialIdType(0);
		Integer savePatientCode = 0;
		if(mzPatient.getPatientId() == null){
			savePatientCode = mzPatientMapper.insert(mzPatient);
			if(visitForm.getSelfFlag().equals(0)){
				xtPerson.setPatientId(mzPatient.getPatientId());
				xtPersonMapper.updateByPrimaryKeySelective(xtPerson);
			}else{
				xtPersonFamily.setPatientId(mzPatient.getPatientId());
				xtPersonFamilyMapper.updateByPrimaryKeySelective(xtPersonFamily);
			}
		}else{
			savePatientCode = mzPatientMapper.updateByPrimaryKeySelective(mzPatient);
		}
		if(savePatientCode > 0){
			return mzPatient;
		}
		return null;
	}

	@Override
	public MzPatient selectPatientById(Long patientId) {
		return mzPatientMapper.selectByPrimaryKey(patientId);
	}

	@Override
	public MzPatient selectPatientAndAddressDetail(Long id) {
		return mzPatientMapper.selectPatientAndAddressDetail(id);
	}

	@Override
	public List<MzPatient> getPatientListByUserId(String userId) {
		List<MzPatient> list = mzPatientMapper.getPatientListByUserId(userId);
		//查询地址
		if (list.size()>1) {
			for (MzPatient mzPatient : list) {
				MzVisit visit = mzVisitMapper.getNewestVisit(mzPatient.getPatientId());//最新一条记录
				if (visit!=null) {
					Doctor doctor = doctorMapper.selectDoctorById(visit.getDoctorId());
					if (doctor!=null) {
						visit.setDoctorName(doctor.getName());
						mzPatient.setVisit(visit);
					}
				}
			}
		}
		return list;
	}

}
