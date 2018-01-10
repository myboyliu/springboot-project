package com.huatuo.customer.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.DtUserPackageRecordMapper;
import com.huatuo.customer.domain.DtUserPackageRecord;
import com.huatuo.customer.service.DtUserPackageRecordService;

@Service
public class DtUserPackageRecordServiceImpl implements DtUserPackageRecordService {
	
	@Autowired
	private DtUserPackageRecordMapper recordMapper;

	@Override
	public int residueDegree(String userId, String dtTeamId, Integer serviceType) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("dtTeamId", dtTeamId);
		map.put("serviceType", serviceType);
		return recordMapper.residueDegree(map);
	}

	@Override
	public DtUserPackageRecord getDtUPRecord(String userId, String dtTeamId, Integer serviceType) {
		if(userId != null && dtTeamId != null && serviceType != null){
			List<DtUserPackageRecord> list = recordMapper.listDtUPRecord(userId, dtTeamId, serviceType);
			if(list != null && list.size() > 0){
				return list.get(0);
			}
		}
		return null;
	}

	@Override
	public int updateResidueDegree(String userPackageRecordId) {
		if(userPackageRecordId == null){
			return 0;
		}
		return recordMapper.updateResidueDegree(userPackageRecordId);
	}



}
