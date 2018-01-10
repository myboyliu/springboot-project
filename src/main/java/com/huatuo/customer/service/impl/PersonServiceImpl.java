package com.huatuo.customer.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.dao.XtAddressMapper;
import com.huatuo.customer.dao.XtPersonMapper;
import com.huatuo.customer.dao.XtUserMapper;
import com.huatuo.customer.domain.XtAddress;
import com.huatuo.customer.domain.XtPerson;
import com.huatuo.customer.domain.XtUser;
import com.huatuo.customer.request.PersonParam;
import com.huatuo.customer.request.VisitForm;
import com.huatuo.customer.service.PersonService;

@Service
@Transactional
public class PersonServiceImpl implements PersonService{

	@Autowired
	private XtPersonMapper xtPersonMapper;

	@Autowired
	private XtAddressMapper xtAddressMapper;
	
	@Autowired
	private XtUserMapper xtUserMapper;
	
	@Override
	public Integer updatePerson(VisitForm visitForm) {
		XtPerson xtPerson = xtPersonMapper.selectPersonByUserId(visitForm.getUserId());
		xtPerson.setName(visitForm.getPatientName());
		xtPerson.setSex(visitForm.getSex());
		xtPerson.setBirthdate(visitForm.getBirthdate());
		xtPerson.setHomeTel(visitForm.getMobile());
		xtPerson.setSocialId(visitForm.getSocialId());
		xtPerson.setAddressId(visitForm.getAddressId());
		xtPerson.setAllergicHistory(visitForm.getAllergicHistory());
		return xtPersonMapper.updateByPrimaryKeySelective(xtPerson);
	}

	@Override
	public XtPerson getPersonByUserId(String userId) {
		if(userId != null){
			return xtPersonMapper.selectPersonByUserId(Long.valueOf(userId));
		}
		return null;
	}

	@Override
	public XtPerson selectPersonByUserId(Long userId) {
		return xtPersonMapper.selectPersonByUserId(userId);
	}

	@Override
	public com.huatuo.register.domain.XtPerson selectByUserIdForLogin(
			Long userId) {
		return xtPersonMapper.selectByUserIdForLogin(userId);
	}

	@Override
	public Integer savePersonInfo(PersonParam personParam) {
		/**
		 * 先更新地址信息
		 */
		Integer saveOrUpdateAddressCode = 0;
		XtAddress xtAddress = Utils.exchangeObject(personParam, XtAddress.class);
		if(xtAddress.getAddressId() == null){
			saveOrUpdateAddressCode = xtAddressMapper.insert(xtAddress);
		}else{
			saveOrUpdateAddressCode = xtAddressMapper.updateByPrimaryKeySelective(xtAddress);
		}
		if(saveOrUpdateAddressCode > 0){
		/**
		 * 修改个人信息
		 */
		XtPerson xtPerson = xtPersonMapper.selectPersonByUserId(personParam.getUserId());
		if(xtPerson != null){
			xtPerson.setName(personParam.getName());
			xtPerson.setHomeTel(personParam.getHomeTel());
			xtPerson.setBirthdate(personParam.getBirthdate().substring(0, 10));
			xtPerson.setAddressId(xtAddress.getAddressId());
			xtPerson.setSex(personParam.getSex());
			xtPerson.setSocialId(personParam.getSocialId());
			xtPerson.setBirthPlace(personParam.getBirthPlace());
			xtPerson.setNation(personParam.getNation());
			xtPerson.setMarry(personParam.getMarry());
			xtPerson.setOccupationId(personParam.getOccupationId());
			xtPerson.setAllergicHistory(personParam.getAllergicHistory());
			xtPerson.setAge(personParam.getAge());
			int updatePersonCode = xtPersonMapper.updateByPrimaryKeySelective(xtPerson);
			if(updatePersonCode > 0){
				XtUser xtUser = xtUserMapper.selectByPrimaryKey(xtPerson.getUserId());
				xtUser.setName(xtPerson.getName());
				xtUser.setTureName(xtPerson.getName());
				xtUser.setSex(xtPerson.getSex());
//				xtUser.setMobile(personParam.getHomeTel());
				int updateUserCode = xtUserMapper.updateByPrimaryKeySelective(xtUser);
				if(updatePersonCode > 0){
					return updateUserCode;
				}else{
					throw new RuntimeException("更新登录用户信息失败");
				}
			}else{
				throw new RuntimeException("保存个人信息失败");
			}
		}else{
			throw new RuntimeException("用户信息不存在");
		}
	}
//		XtAddress xtAddress = xtAddressMapper.selectByPrimaryKey(personParam.getAddressId());

//		if(xtAddress== null){
//			XtAddress newAddress = new XtAddress();
//			newAddress.setProvinceCode(personParam.getProvinceCode());
//			newAddress.setProvince(personParam.getProvince());
//			newAddress.setCityCode(personParam.getCityCode());
//			newAddress.setCity(personParam.getCity());
//			newAddress.setCountyCode(personParam.getCountyCode());
//			newAddress.setCounty(personParam.getCounty());
//			newAddress.setRoadCode(personParam.getRoadCode());
//			newAddress.setRoad(personParam.getRoad());
//			newAddress.setAddress(personParam.getAddress());
//			saveOrUpdateAddressCode = xtAddressMapper.insert(newAddress);
//		}else{
//			xtAddress.setProvinceCode(personParam.getProvinceCode());
//			xtAddress.setProvince(personParam.getProvince());
//			xtAddress.setCityCode(personParam.getCityCode());
//			xtAddress.setCity(personParam.getCity());
//			xtAddress.setCountyCode(personParam.getCountyCode());
//			xtAddress.setCounty(personParam.getCounty());
//			xtAddress.setRoadCode(personParam.getRoadCode());
//			xtAddress.setRoad(personParam.getRoad());
//			xtAddress.setAddress(personParam.getAddress());
//			saveOrUpdateAddressCode = xtAddressMapper.updateByPrimaryKeySelective(xtAddress);
//		}
		return null;
	}
	
}
