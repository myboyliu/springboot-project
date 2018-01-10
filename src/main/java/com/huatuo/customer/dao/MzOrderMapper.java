package com.huatuo.customer.dao;

import java.util.List;

import com.huatuo.customer.domain.MzOrder;

public interface MzOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MzOrder record);

    int insertSelective(MzOrder record);

    MzOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MzOrder record);

    int updateByPrimaryKeyWithBLOBs(MzOrder record);

    int updateByPrimaryKey(MzOrder record);
    /**
     * 根据就诊查询未删除的处方列表
     * @param visitId
     * @return
     */
	List<MzOrder> getListByVisitId(Long visitId);
}