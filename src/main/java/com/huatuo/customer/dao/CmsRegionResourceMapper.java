package com.huatuo.customer.dao;

import com.huatuo.customer.domain.CmsRegionResource;

public interface CmsRegionResourceMapper {
    int deleteByPrimaryKey(String id);

    int insert(CmsRegionResource record);

    int insertSelective(CmsRegionResource record);

    CmsRegionResource selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CmsRegionResource record);

    int updateByPrimaryKey(CmsRegionResource record);
    
    CmsRegionResource selectRegionResourceByRegionId(Integer regionId);
}