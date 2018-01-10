package com.huatuo.customer.dao;

import java.util.List;

import com.huatuo.customer.domain.XtZdFamilyRelation;

public interface XtZdFamilyRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XtZdFamilyRelation record);

    int insertSelective(XtZdFamilyRelation record);

    XtZdFamilyRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XtZdFamilyRelation record);

    int updateByPrimaryKey(XtZdFamilyRelation record);
    
	/**
	 * 查询所有数据
	 */
    List<XtZdFamilyRelation> selectFamilyRelation();
}