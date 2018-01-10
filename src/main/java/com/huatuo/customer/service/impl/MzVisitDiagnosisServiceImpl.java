package com.huatuo.customer.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.MzVisitDiagnosisMapper;
import com.huatuo.customer.domain.MzVisitDiagnosis;
import com.huatuo.customer.service.MzVisitDiagnosisService;

@Service
@Transactional
public class MzVisitDiagnosisServiceImpl implements MzVisitDiagnosisService{	
	
	@Autowired
	private MzVisitDiagnosisMapper mzVisitDiagnosisMapper;

	@Override
	public List<MzVisitDiagnosis> getListByVisitId(Long visitId) {
		return mzVisitDiagnosisMapper.getListByVisitId(visitId);
	}
}
