package com.huatuo.customer.service.impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.dao.XtHealthSportMapper;
import com.huatuo.customer.domain.XtHealthSport;
import com.huatuo.customer.service.XtHealthSportService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor=Exception.class)
public class XtHealthSportImpl implements XtHealthSportService{
	
	@Autowired
	private XtHealthSportMapper xtHealthSportMapper;

	
	@Override
	public XtHealthSport getHealthSportByUserId(Long userId) {
        Map<String,Object> map = new HashMap<String,Object>();
		String recordTime = Utils.getNowTime();
		String recordTime1[] = recordTime.split(" ");
		map.put("recordTime", recordTime1[0]);
		map.put("userId", userId+"");		
		return xtHealthSportMapper.selectByUserId(map);
	}

	@Override
	@Transactional
	public int save(XtHealthSport sport) {
		sport.setRecordTime(Utils.getNowTime());
		XtHealthSport sportDay = xtHealthSportMapper.selectToday(sport);
		if(sportDay==null){
			return xtHealthSportMapper.insert(sport);
		}
		sport.setId(sportDay.getId());
		return xtHealthSportMapper.updateByPrimaryKey(sport);
	}

}
