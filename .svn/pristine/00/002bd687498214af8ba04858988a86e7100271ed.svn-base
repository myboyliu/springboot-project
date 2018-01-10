package com.huatuo.customer.dao;

import com.huatuo.customer.domain.XtAddress;
import com.huatuo.customer.domain.XtAddressCriteria;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XtAddressMapper {
	
	List<XtAddress> selectAllAddressInfo();
	
    int countByExample(XtAddressCriteria example);

    int deleteByExample(XtAddressCriteria example);

    int deleteByPrimaryKey(Long addressId);

    int insert(XtAddress record);

    int insertSelective(XtAddress record);

    List<XtAddress> selectByExampleWithRowbounds(XtAddressCriteria example, RowBounds rowBounds);

    List<XtAddress> selectByExample(XtAddressCriteria example);

    XtAddress selectByPrimaryKey(Long addressId);

    int updateByExampleSelective(@Param("record") XtAddress record, @Param("example") XtAddressCriteria example);

    int updateByExample(@Param("record") XtAddress record, @Param("example") XtAddressCriteria example);

    int updateByPrimaryKeySelective(XtAddress record);

    int updateByPrimaryKey(XtAddress record);
    
    public List<Map<String,Object>> selectJsonAddressInfo();
    
	/**
	 * 通过省份provinceCode查城市信息
	 * @return
	 */
	public List<Map<String,Object>> getJsonCityInfoByProCode(@Param("provinceCode")Integer provinceCode);

	/**
	 * 通过城市provinceCode县/区信息
	 * @return
	 */
	public List<Map<String,Object>> getJsonCountyInfoByCityCode(@Param("cityCode")Integer cityCode);
	
	/**
	 * 登录查询地址
	 * @param addressId
	 * @return
	 */
    public com.huatuo.register.domain.XtAddress selectByPrimaryKeyForLogin(Long addressId);
}