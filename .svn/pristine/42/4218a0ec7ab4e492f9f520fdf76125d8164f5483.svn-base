package com.huatuo.customer.dao;

import com.huatuo.customer.domain.XtPersonFamily;
import com.huatuo.customer.domain.XtPersonFamilyCriteria;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XtPersonFamilyMapper {
    int countByExample(XtPersonFamilyCriteria example);

    int deleteByExample(XtPersonFamilyCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(XtPersonFamily record);

    int insertSelective(XtPersonFamily record);

    List<XtPersonFamily> selectByExampleWithRowbounds(XtPersonFamilyCriteria example, RowBounds rowBounds);

    List<XtPersonFamily> selectByExample(XtPersonFamilyCriteria example);

    XtPersonFamily selectByPrimaryKey(Long id);
    
    XtPersonFamily selectByFamilyId(Long id);

    int updateByExampleSelective(@Param("record") XtPersonFamily record, @Param("example") XtPersonFamilyCriteria example);

    int updateByExample(@Param("record") XtPersonFamily record, @Param("example") XtPersonFamilyCriteria example);

    int updateByPrimaryKeySelective(XtPersonFamily record);

    int updateByPrimaryKey(XtPersonFamily record);
    
    List<XtPersonFamily> selectFamilyListByUserId(Long userId);

    
    //自定义
    /**
     * 统计家庭人数
     * @param map
     * @return
     */
	int countFamilyByUserId(Map<String, Object> map);

}