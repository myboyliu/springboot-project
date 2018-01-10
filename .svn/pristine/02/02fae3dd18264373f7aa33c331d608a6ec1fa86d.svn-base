package com.huatuo.customer.service.impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.dao.XtHealthCenterMapper;
import com.huatuo.customer.domain.XtHealthCenter;
import com.huatuo.customer.domain.XtHealthCenterHistory;
import com.huatuo.customer.domain.XtHealthCenterPojo;
import com.huatuo.customer.query.HealthCenterQuery;
import com.huatuo.customer.service.XtHealthCenterService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor=Exception.class)
public class XtHealthCenterServiceImpl implements XtHealthCenterService{

	@Autowired
	private  XtHealthCenterMapper xtHealthCenterMapper;
	
	
	@Override
	public List<XtHealthCenter> getXtHealthCenterList(String userId,Long type,Integer dateFlag) {
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("userId", userId);
		map.put("type", type);
		String array[] = Utils.getNowTime().split(" ");
		String measuringDate = array[0].trim(); 
		map.put("dateFlag", dateFlag);
		if(dateFlag==1){//当天
	        map.put("measuringDate", measuringDate);		
		}
		if(dateFlag==2){//当天所在的周
			String firstOfWeek = Utils.getDayOfWeek(measuringDate,1).trim();//周日
			String lastOfWeek =  Utils.getDayOfWeek(measuringDate,7).trim();//周六
			map.put("firstOfWeek", firstOfWeek);
			map.put("lastOfWeek", lastOfWeek);
		}
		if(dateFlag==3){//当天所在的月
			String firstOfMonth = Utils.getDayOfMonth("first").trim();
			String lastOfMonth = Utils.getDayOfMonth("last").trim();
			map.put("firstOfMonth", firstOfMonth);
			map.put("lastOfMonth", lastOfMonth);
		}	
		return xtHealthCenterMapper.selectXtHealthCenterList(map);
	}

	@Override
	public List<XtHealthCenterPojo> countInMonth(String userId,Long type,Integer dateFlag) {		
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("userId", userId);
		map.put("type", type);
	    String firstOfMonth = Utils.getDayOfMonth("first").trim();
		String lastOfMonth = Utils.getDayOfMonth("last").trim();
		map.put("firstOfMonth", firstOfMonth);
		map.put("lastOfMonth", lastOfMonth);
		return xtHealthCenterMapper.countInMonth(map);
	}

	
	@Override
	@Transactional
	public int saveHealth(XtHealthCenter healthCenter) {
		healthCenter.setRecordTime(Utils.getNowTime());
		return xtHealthCenterMapper.save(healthCenter);
	}


	@Override
	public Page<XtHealthCenterHistory> getHistory(HealthCenterQuery healthCenterQuery) {
		int total = xtHealthCenterMapper.countHistory(healthCenterQuery);
		if (total > 0) {
			Page<XtHealthCenterHistory> page = new Page<>(total, healthCenterQuery.getCurrentPage(), healthCenterQuery.getPageSize());
			healthCenterQuery.setStart(page.getStart());
			List<XtHealthCenterHistory> data = xtHealthCenterMapper.getHistory(healthCenterQuery);
			page.setList(data);
			return page;
		}
		return null;
	}


	@Override
	public List<HealthStatusCount> getStatistics(HealthCenterQuery healthCenterQuery) {
		int total = xtHealthCenterMapper.countHistory(healthCenterQuery);
//		Map<String, Object> data = new LinkedHashMap<>();
		List<HealthStatusCount> data = new ArrayList<>();
		HealthStatusCount allCount = new HealthStatusCount("全部", total);
		data.add(allCount);
//		data.put("全部", total);
		if (total > 0) {
			List<Map<String, Object>> statistics = xtHealthCenterMapper.getStatistics(healthCenterQuery);
			for (Map<String, Object> map : statistics) {
				String healthStatus = (String) map.get("healthStatus");
				Integer count = ((Long) map.get("count")).intValue();
				HealthStatusCount other = new HealthStatusCount(healthStatus, count);
//				data.put(healthStatus, count);
				data.add(other);
			}
		}
		return data;
	}
	
	class HealthStatusCount {
		private String status;
		private Integer count;
		
		public HealthStatusCount(String status, Integer count) {
			super();
			this.status = status;
			this.count = count;
		}
		public String getStatus() {
			return status;
		}
		public Integer getCount() {
			return count;
		}
	}

	@Override
	public List<String> getBsRecord(HealthCenterQuery healthCenterQuery) {
		return xtHealthCenterMapper.getBsRecord(healthCenterQuery);
	}

}
