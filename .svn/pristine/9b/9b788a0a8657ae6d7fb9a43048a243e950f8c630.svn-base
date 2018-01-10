package com.huatuo.customer.dao;

import com.huatuo.customer.domain.XtSpecialty;
import com.huatuo.customer.domain.XtSpecialtyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XtSpecialtyMapper {
    int countByExample(XtSpecialtyCriteria example);

    int deleteByExample(XtSpecialtyCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(XtSpecialty record);

    int insertSelective(XtSpecialty record);

    List<XtSpecialty> selectByExampleWithRowbounds(XtSpecialtyCriteria example, RowBounds rowBounds);

    List<XtSpecialty> selectByExample(XtSpecialtyCriteria example);

    XtSpecialty selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XtSpecialty record, @Param("example") XtSpecialtyCriteria example);

    int updateByExample(@Param("record") XtSpecialty record, @Param("example") XtSpecialtyCriteria example);

    int updateByPrimaryKeySelective(XtSpecialty record);

    int updateByPrimaryKey(XtSpecialty record);
    
    List<XtSpecialty> selectSpecialtyInfo();
    /**
     * 根据上级id查询出下一级专科
     * @param specialtyId
     * @return
     */
    List<XtSpecialty> selectSubsetSpecialtys(Integer specialtyId);
    
    /**
     * 根据科室代码查询出当前科室以及子科室
     * @param specialtyId
     * @return
     */
    List<XtSpecialty> selectSpecialtyInfoByIdOrParentId(Integer specialtyId);
}