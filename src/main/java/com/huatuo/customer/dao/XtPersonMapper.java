package com.huatuo.customer.dao;

import com.huatuo.customer.domain.XtPerson;
import com.huatuo.customer.domain.XtPersonCriteria;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XtPersonMapper {
    int countByExample(XtPersonCriteria example);

    int deleteByExample(XtPersonCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(XtPerson record);

    int insertSelective(XtPerson record);

    List<XtPerson> selectByExampleWithRowbounds(XtPersonCriteria example, RowBounds rowBounds);

    List<XtPerson> selectByExample(XtPersonCriteria example);

    XtPerson selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XtPerson record, @Param("example") XtPersonCriteria example);

    int updateByExample(@Param("record") XtPerson record, @Param("example") XtPersonCriteria example);

    int updateByPrimaryKeySelective(XtPerson record);

    int updateByPrimaryKey(XtPerson record);
    
    XtPerson selectPersonByUserId(Long userId);
    
    com.huatuo.register.domain.XtPerson selectByUserIdForLogin(Long userId);
}