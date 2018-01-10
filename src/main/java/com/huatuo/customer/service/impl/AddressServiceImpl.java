package com.huatuo.customer.service.impl;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.base.enums.ServiceType;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.dao.XtAddressMapper;
import com.huatuo.customer.dao.XtZdDistrictMapper;
import com.huatuo.customer.domain.XtAddress;
import com.huatuo.customer.domain.XtZdDistrict;
import com.huatuo.customer.query.AddressQuery;
import com.huatuo.customer.request.VisitForm;
import com.huatuo.customer.service.AddressService;

@Service
@Transactional
public class AddressServiceImpl implements AddressService{	
	
	@Autowired
	private XtAddressMapper xtAddressMapper;
	
	@Autowired
	private XtZdDistrictMapper xtZdDistrictMapper;
	
	@Override
	public XtAddress getAddressInfo(Long addressId) {		
		return xtAddressMapper.selectByPrimaryKey(addressId);
	}

	@Override
	public List<XtAddress> getAllAddressInfo() {
		return xtAddressMapper.selectAllAddressInfo();
	}

//	@Override
//	public List<Map<String, Object>> getJsonAddressInfo() {		
//		return xtAddressMapper.selectJsonAddressInfo();
//	}

	@Override
	public List<Map<String, Object>> getJsonCityInfoByProCode(Integer provinceCode) {		
		return xtAddressMapper.getJsonCityInfoByProCode(provinceCode);
	}

	@Override
	public List<Map<String, Object>> getJsonCountyInfoByCityCode(
			Integer cityCode) {
		return xtAddressMapper.getJsonCountyInfoByCityCode(cityCode);
	}
	
	@Override
	public Long saveXtAddress(VisitForm visitForm) {
		Long addressId = null;
		/**
		 * 针对家庭医生，直接返回addressId
		 */
		Boolean isFamilydoctor = false;
		isFamilydoctor = visitForm.getServiceType() != null ? visitForm.getServiceType().equals(ServiceType.FAMILYDOCTOR.getIndex()) : false;
		if(isFamilydoctor){
			return visitForm.getAddressId();
		}
		XtAddress xtAddress = Utils.exchangeObject(visitForm, XtAddress.class);
		if(xtAddress.getAddressId() == null){
			xtAddressMapper.insert(xtAddress);
			addressId = xtAddress.getAddressId();
		}else{
			xtAddressMapper.updateByPrimaryKeySelective(xtAddress);
			addressId = xtAddress.getAddressId();
		}
		return addressId;
	}
	
//	/**
//	 * 添加地址
//	 * @return
//	 */
//	private Long saveAddress(VisitForm visitForm){
////		xtAddress.setProvinceCode(visitForm.getProvinceCode());
////		xtAddress.setCityCode(visitForm.getCityCode());
////		xtAddress.setCountyCode(visitForm.getCountCode());
////		xtAddress.setRoadCode(visitForm.getRoadCode());
////		xtAddress.setProvince(visitForm.getProvince());
////		xtAddress.setCity(visitForm.getCity());
////		xtAddress.setCounty(visitForm.getCounty());
////		xtAddress.setRoad(visitForm.getRoad());
////		xtAddress.setAddress(visitForm.getAddress());
//		XtAddress xtAddress = Utils.exchangeObject(visitForm, XtAddress.class);
//		xtAddressMapper.insert(xtAddress);
//		return xtAddress.getAddressId();
//	}
	
//	/**
//	 * 比较两个地址是否相同
//	 * @param xtAddress
//	 * @param visitForm
//	 * @return
//	 */
//	private Boolean compareAddress(XtAddress xtAddress, VisitForm visitForm){
//		if(xtAddress == null){
//			return false;
//		}
//		return visitForm.getProvinceCode().equals(xtAddress.getProvinceCode()) &&
//				visitForm.getCityCode().equals(xtAddress.getCityCode()) &&
//				visitForm.getCountCode().equals(xtAddress.getCountyCode()) &&
//				visitForm.getRoadCode().equals(xtAddress.getRoadCode()) &&
//				visitForm.getAddress().equals(xtAddress.getAddress());
//		
//	}

	@Override
	public XtAddress selectAddressById(Long addressId) {
		return xtAddressMapper.selectByPrimaryKey(addressId);
	}

	@Override
	public List<XtZdDistrict> selectXtZdDistrictByGrade(
			AddressQuery addressQuery) {
		return xtZdDistrictMapper.selectXtZdDistrictByGrade(addressQuery);
	}

	@Override
	public com.huatuo.register.domain.XtAddress selectByPrimaryKeyForLogin(
			Long addressId) {
		return xtAddressMapper.selectByPrimaryKeyForLogin(addressId);
	}

	@Override
	public List<XtZdDistrict> selectDistrictByGradeOrParentId(
			AddressQuery addressQuery) {
		return xtZdDistrictMapper.selectDistrictByGradeOrParentId(addressQuery);
	}
}
