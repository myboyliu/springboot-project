package com.huatuo.customer.service.impl;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.PayInfoMapper;
import com.huatuo.customer.domain.PayInfo;
import com.huatuo.customer.service.PayInfoService;

@Service
@Transactional
public class PayInfoServiceImpl implements PayInfoService{

	@Autowired
	private PayInfoMapper payInfoMapper;

	@Override
	public Integer savePayInfo(PayInfo payInfo) {
		return payInfoMapper.insert(payInfo);
	}

	@Override
	public PayInfo selectPayInfoByOrderNo(String orderNo) {
		return payInfoMapper.selectPayInfoByOrderNo(orderNo);
	}

}
