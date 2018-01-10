package com.huatuo.customer.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.StringUtil;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.dao.XtAddressMapper;
import com.huatuo.customer.dao.XtPersonFamilyMapper;
import com.huatuo.customer.domain.XtAddress;
import com.huatuo.customer.domain.XtPersonFamily;
import com.huatuo.customer.exception.VisitException;
import com.huatuo.customer.request.PersonParam;
import com.huatuo.customer.request.VisitForm;
import com.huatuo.customer.service.PersonFamilyService;

@Service
@Transactional
public class PersonFamilyServiceImpl implements PersonFamilyService{
	
	@Autowired
	private XtPersonFamilyMapper xtPersonFamilyMapper;
	
	@Autowired
	private XtAddressMapper xtAddressMapper;
	
	
	@Override
	public List<XtPersonFamily> selectFamilyListByUserId(Long userId) {
		return xtPersonFamilyMapper.selectFamilyListByUserId(userId);
	}

	@Override
	public Integer updatePersonFamily(XtPersonFamily xtPersonFamily) {
		return xtPersonFamilyMapper.updateByPrimaryKey(xtPersonFamily);
	}

	@Override
	public XtPersonFamily selectOneFamily(Long personFamilyId) {
		return xtPersonFamilyMapper.selectByPrimaryKey(personFamilyId);
	}

	@Override
	public Integer updatePersonFamilyByVisitFrom(VisitForm visitForm) {
		if(visitForm.getMemberId() == null){
			throw new VisitException("非本人咨询时家庭成员id为空");
		}
		XtPersonFamily xtPersonFamily = xtPersonFamilyMapper.selectByPrimaryKey(visitForm.getMemberId());
		xtPersonFamily.setAddressId(visitForm.getAddressId());
		xtPersonFamily.setName(visitForm.getPatientName());
		xtPersonFamily.setSex(visitForm.getSex());
		xtPersonFamily.setBirthdate(visitForm.getBirthdate());
		xtPersonFamily.setHomeTel(visitForm.getMobile());
		xtPersonFamily.setSocialId(visitForm.getSocialId());
		xtPersonFamily.setAllergicHistory(visitForm.getAllergicHistory());
		return xtPersonFamilyMapper.updateByPrimaryKeySelective(xtPersonFamily);
	}

	@Override
	public Integer updatePersonFamilyModel(PersonParam personParam) {
		XtPersonFamily xtPersonFamily = Utils.exchangeObject(personParam, XtPersonFamily.class);
		if(xtPersonFamily.getPersonFamilyId() == null){
			throw new RuntimeException("更新家庭成员信息失败，家庭成员id为空");
		}
		if(StringUtil.isEmpty(xtPersonFamily.getBirthdate())){
			throw new RuntimeException("更新家庭成员信息失败，出生日期为空");
		}else{
			xtPersonFamily.setBirthdate(xtPersonFamily.getBirthdate().substring(0, 10));
		}
		XtAddress xtAddress = Utils.exchangeObject(personParam, XtAddress.class);
		Integer insertCode = 0;
		if(xtAddress.getAddressId() != null){
			insertCode = xtAddressMapper.updateByPrimaryKeySelective(xtAddress);
		}else{
			insertCode = xtAddressMapper.insert(xtAddress);
		}
		if(insertCode > 0){
			xtPersonFamily.setAddressId(xtAddress.getAddressId());
			return xtPersonFamilyMapper.updateByPrimaryKeySelective(xtPersonFamily);
		}else{
			throw new RuntimeException("更新家庭成员信息失败");
		}
	}

	@Override
	public Integer deletePersonFamily(Long personFamilyId) {
		return xtPersonFamilyMapper.deleteByPrimaryKey(personFamilyId);
	}

	@Override
	public XtPersonFamily selectOneFamilyById(Long personFamilyId) {
		return xtPersonFamilyMapper.selectByFamilyId(personFamilyId);
	}

	@Override
	public Long insertFamily(PersonParam personParam) {
		XtPersonFamily xtPersonFamily = Utils.exchangeObject(personParam, XtPersonFamily.class);
		if(StringUtil.isEmpty(xtPersonFamily.getBirthdate())){
			throw new RuntimeException("保存家庭成员信息失败，出生日期为空");
		}else{
			xtPersonFamily.setBirthdate(xtPersonFamily.getBirthdate().substring(0, 10));
		}
		XtAddress xtAddress = Utils.exchangeObject(personParam, XtAddress.class);
		int insertCode = xtAddressMapper.insert(xtAddress);
		if(insertCode > 0){
			xtPersonFamily.setSocialIdType(0);
			xtPersonFamily.setRelatedUserId(0L);
			xtPersonFamily.setSex(personParam.getSex() == null ? 0 : personParam.getSex());
			xtPersonFamily.setAddressId(xtAddress.getAddressId());
			xtPersonFamilyMapper.insert(xtPersonFamily);
			return xtPersonFamily.getPersonFamilyId();
		}else{
			throw new RuntimeException("保存家庭成员信息失败");
		}
	}

}
