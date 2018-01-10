package com.huatuo.customer.dao;

import com.huatuo.customer.domain.XtDrugstore;
import com.huatuo.customer.domain.XtDrugstoreCriteria;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XtDrugstoreMapper {
    int countByExample(XtDrugstoreCriteria example);

    int deleteByExample(XtDrugstoreCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(XtDrugstore record);

    int insertSelective(XtDrugstore record);

    List<XtDrugstore> selectByExampleWithRowbounds(XtDrugstoreCriteria example, RowBounds rowBounds);

    List<XtDrugstore> selectByExample(XtDrugstoreCriteria example);

    XtDrugstore selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") XtDrugstore record, @Param("example") XtDrugstoreCriteria example);

    int updateByExample(@Param("record") XtDrugstore record, @Param("example") XtDrugstoreCriteria example);

    int updateByPrimaryKeySelective(XtDrugstore record);

    int updateByPrimaryKey(XtDrugstore record);
    /**
     * 根据经纬度算距离最近的n个药店
     * @param map
     * @return
     */
	List<XtDrugstore> getDrugstoreByCoordinate(Map<String, Object> map);
}