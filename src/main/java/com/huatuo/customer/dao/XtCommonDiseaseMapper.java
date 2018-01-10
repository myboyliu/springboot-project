package com.huatuo.customer.dao;

import com.huatuo.customer.domain.XtCommonDisease;
import com.huatuo.customer.domain.XtCommonDiseaseCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XtCommonDiseaseMapper {
    int countByExample(XtCommonDiseaseCriteria example);

    int deleteByExample(XtCommonDiseaseCriteria example);

    int deleteByPrimaryKey(String disId);

    int insert(XtCommonDisease record);

    int insertSelective(XtCommonDisease record);

    List<XtCommonDisease> selectByExampleWithRowbounds(XtCommonDiseaseCriteria example, RowBounds rowBounds);

    List<XtCommonDisease> selectByExample(XtCommonDiseaseCriteria example);

    XtCommonDisease selectByPrimaryKey(String disId);

    int updateByExampleSelective(@Param("record") XtCommonDisease record, @Param("example") XtCommonDiseaseCriteria example);

    int updateByExample(@Param("record") XtCommonDisease record, @Param("example") XtCommonDiseaseCriteria example);

    int updateByPrimaryKeySelective(XtCommonDisease record);

    int updateByPrimaryKey(XtCommonDisease record);
}