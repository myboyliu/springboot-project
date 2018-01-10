package com.huatuo.customer.dao;

import java.util.Map;

import com.huatuo.customer.domain.XtHealthSport;

public interface XtHealthSportMapper {
    int deleteByPrimaryKey(String id);

    int insert(XtHealthSport record);

    int insertSelective(XtHealthSport record);

    XtHealthSport selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(XtHealthSport record);

    int updateByPrimaryKey(XtHealthSport record);
    
    XtHealthSport selectByUserId(Map<String,Object> map);
    
    XtHealthSport selectToday(XtHealthSport sport);
}