package com.huatuo.customer.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.MzOrderDtlMapper;
import com.huatuo.customer.dao.MzOrderMapper;
import com.huatuo.customer.dao.MzZdFrequencyMapper;
import com.huatuo.customer.dao.YpZdSupplyMapper;
import com.huatuo.customer.dao.YpZdUnitMapper;
import com.huatuo.customer.domain.MzOrder;
import com.huatuo.customer.domain.MzOrderDtl;
import com.huatuo.customer.domain.MzZdFrequency;
import com.huatuo.customer.domain.YpZdSupply;
import com.huatuo.customer.domain.YpZdUnit;
import com.huatuo.customer.service.MzOrderService;

@Service
@Transactional
public class MzOrderServiceImpl implements MzOrderService{	
	
	@Autowired
	private MzOrderMapper mzOrderMapper;
	
	@Autowired
	private YpZdUnitMapper ypZdUnitMapper;
	
	@Autowired
	private YpZdSupplyMapper ypZdSupplyMapper;
	
	@Autowired
	private MzOrderDtlMapper mzOrderDtlMapper;
	
	@Autowired
	private MzZdFrequencyMapper mzZdFrequencyMapper;
	
	@Override
	public List<MzOrder> getListByVisitId(Long visitId) {
		List<MzOrder> orders = mzOrderMapper.getListByVisitId(visitId);
		if (orders.size()>0) {
			for (MzOrder mzOrder : orders) {
				List<MzOrderDtl> orderDtls = mzOrderDtlMapper.getListByOrderId(mzOrder.getId());
				if (orderDtls.size()>0) {
					for (MzOrderDtl mzOrderDtl : orderDtls) {
						mzOrderDtl.setDoseUnitName(getNameById(mzOrderDtl.getDoseUnit(),1));
						mzOrderDtl.setUseUnitName(getNameById(mzOrderDtl.getUseUnit(),1));
						mzOrderDtl.setAmountUnitName(getNameById(mzOrderDtl.getAmountUnit(),1));
						mzOrderDtl.setSupplyIdName(getNameById(mzOrderDtl.getSupplyId(),2));
						MzZdFrequency mzZdFrequency = mzZdFrequencyMapper.selectByPrimaryKey(mzOrderDtl.getFrequId());
						if(mzZdFrequency != null){
							mzOrderDtl.setFrequName(mzZdFrequency.getPrintName());
						}
						
					}
				}
				mzOrder.setOrderDtls(orderDtls);
			}
		}
		return orders;
	}
	/**
	 * 通过id拿字典name
	 * @param id
	 * @param sign 1=查询单位，2=查询服药方式
	 * @return
	 */
	private String getNameById(Integer id,Integer sign){
		if (sign == 1) {
			YpZdUnit unit = ypZdUnitMapper.selectByPrimaryKey(id);
			return unit == null? null:unit.getName();
		}else if (sign == 2) {
			YpZdSupply supply = ypZdSupplyMapper.selectByPrimaryKey(id);
			return supply == null? null:supply.getName();
		}
		return null;
	}
}
