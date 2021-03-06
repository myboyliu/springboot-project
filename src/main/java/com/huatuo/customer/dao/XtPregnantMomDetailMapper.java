package com.huatuo.customer.dao;

import java.util.List;

import com.huatuo.customer.domain.XtPregnantMomDetail;
import com.huatuo.customer.query.PregnantMomQuery;

public interface XtPregnantMomDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(XtPregnantMomDetail record);

    int insertSelective(XtPregnantMomDetail record);

    XtPregnantMomDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(XtPregnantMomDetail record);

    int updateByPrimaryKey(XtPregnantMomDetail record);
	
	List<XtPregnantMomDetail> selectPregnantMomDetailsByUserId(PregnantMomQuery pregnantMomQuery);
}