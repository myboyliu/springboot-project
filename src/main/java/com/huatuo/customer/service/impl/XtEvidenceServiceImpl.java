package com.huatuo.customer.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huatuo.customer.base.domain.XtEvidence;
import com.huatuo.customer.dao.XtEvidenceMapper;
import com.huatuo.customer.service.XtEvidenceService;


@Service
public class XtEvidenceServiceImpl implements XtEvidenceService {
	@Resource
	private XtEvidenceMapper xtEvidenceMapper;

	@Override
	public XtEvidence select(XtEvidence xtEvidence) {
		return xtEvidenceMapper.select(xtEvidence);
	}

	@Override
	public void save(XtEvidence xtEvidence) {
		xtEvidenceMapper.save(xtEvidence);
	}
}
