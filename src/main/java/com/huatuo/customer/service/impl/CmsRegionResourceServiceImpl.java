package com.huatuo.customer.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.CmsRegionResourceMapper;
import com.huatuo.customer.domain.CmsRegionResource;
import com.huatuo.customer.service.CmsRegionResourceService;

/**
 * 区域资源管业务
 * @author master
 *
 */
@Service 
@Transactional
public class CmsRegionResourceServiceImpl implements CmsRegionResourceService{

	@Autowired
	private CmsRegionResourceMapper cmsRegionResourceMapper;
	
	@Override
	public CmsRegionResource selectRegionResourceByRegionId(Integer regionId) {
		return cmsRegionResourceMapper.selectRegionResourceByRegionId(regionId);
	}

}
