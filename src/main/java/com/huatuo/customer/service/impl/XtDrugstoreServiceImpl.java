package com.huatuo.customer.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.XtAddressMapper;
import com.huatuo.customer.dao.XtDrugstoreMapper;
import com.huatuo.customer.domain.XtAddress;
import com.huatuo.customer.domain.XtDrugstore;
import com.huatuo.customer.service.XtDrugstoreService;

@Service
@Transactional
public class XtDrugstoreServiceImpl implements XtDrugstoreService{	
	
	@Autowired
	private XtDrugstoreMapper xtDrugstoreMapper;
	@Autowired
	private XtAddressMapper addressMapper;
	
	@Override
	public List<XtDrugstore> getDrugstoreByCoordinate(Double longitude, Double latitude, Integer pageSize){
		Map<String,Object> map = new HashMap<>();
		if (longitude!=null) {
			map.put("longitude", longitude);
		}
		if (latitude!=null) {
			map.put("latitude", latitude);
		}
		if (pageSize!=null) {
			map.put("pageSize", pageSize);
		}
		//查询详细地址
		List<XtDrugstore> xtDrugstore = xtDrugstoreMapper.getDrugstoreByCoordinate(map);
		for (XtDrugstore xtDrugstore2 : xtDrugstore) {
			if (xtDrugstore2.getAddressId()!=null && !xtDrugstore2.getAddressId().equals("")) {
				XtAddress address = addressMapper.selectByPrimaryKey(xtDrugstore2.getAddressId());
				xtDrugstore2.setXtAddress(address);
			}
		}
		return xtDrugstore;
	}
	
}
