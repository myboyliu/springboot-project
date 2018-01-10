package com.huatuo.customer.dao;

import java.util.List;

import com.huatuo.customer.domain.MzOrderDtl;

public interface MzOrderDtlMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MzOrderDtl record);

    int insertSelective(MzOrderDtl record);

    MzOrderDtl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MzOrderDtl record);

    int updateByPrimaryKeyWithBLOBs(MzOrderDtl record);

    int updateByPrimaryKey(MzOrderDtl record);
    /**
     * 根据处方id查询处方详情
     * @return
     */
	List<MzOrderDtl> getListByOrderId(Long orderId);
}