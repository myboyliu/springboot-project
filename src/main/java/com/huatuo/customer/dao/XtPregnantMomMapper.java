package com.huatuo.customer.dao;

import com.huatuo.customer.domain.XtPregnantMom;

public interface XtPregnantMomMapper {
    int deleteByPrimaryKey(String pregnantMomId);

    int insert(XtPregnantMom record);

    int insertSelective(XtPregnantMom record);

    XtPregnantMom selectByPrimaryKey(String pregnantMomId);

    int updateByPrimaryKeySelective(XtPregnantMom record);

    int updateByPrimaryKey(XtPregnantMom record);

    /**
     * 用userid获得有效的孕妈状态信息
     * @param userId
     * @return
     */
	XtPregnantMom selectByUid(String userId);
}