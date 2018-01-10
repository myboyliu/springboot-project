package com.huatuo.customer.service;

import java.util.List;
import java.util.Map;
import com.huatuo.customer.domain.XtAddress;
import com.huatuo.customer.domain.XtZdDistrict;
import com.huatuo.customer.query.AddressQuery;
import com.huatuo.customer.request.VisitForm;



public interface AddressService {
	
	public XtAddress getAddressInfo(Long addressId);
	
	public List<XtAddress> getAllAddressInfo();
	
//	public List<Map<String,Object>> getJsonAddressInfo();
	
	/**
	 * 通过省份provinceCode查城市信息
	 * @return
	 */
	public List<Map<String,Object>> getJsonCityInfoByProCode(Integer provinceCode);
	
	
	/**
	 * 通过城市provinceCode县/区信息
	 * @return
	 */
	public List<Map<String,Object>> getJsonCountyInfoByCityCode(Integer cityCode);
	
	/**
	 * 保存一条地址信息
	 * @param xtAddress
	 * @return
	 */
	public Long saveXtAddress(VisitForm visitForm);
	
	/**
	 * 根据地址id查询一条地址信息
	 * @param addressId
	 * @return
	 */
	public XtAddress selectAddressById(Long addressId);

	/**
	 * 根据等级查询区域
	 * @param addressQuery
	 * @return
	 */
	public List<XtZdDistrict> selectXtZdDistrictByGrade(AddressQuery addressQuery);
	
	/**
	 * 登录时查询Address对象
	 * @param addressId
	 * @return
	 */
	public com.huatuo.register.domain.XtAddress selectByPrimaryKeyForLogin(Long addressId);
	
	/**
	 * 根据等级或者父子级查询地址信息
	 * @return
	 */
	public List<XtZdDistrict> selectDistrictByGradeOrParentId(AddressQuery addressQuery);
	
}
