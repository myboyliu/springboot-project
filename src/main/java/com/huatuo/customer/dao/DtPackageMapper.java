package com.huatuo.customer.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huatuo.customer.domain.DtPackTeamPojo;
import com.huatuo.customer.domain.DtPackage;
import com.huatuo.customer.domain.DtPackagePojo;

public interface DtPackageMapper {
    int deleteByPrimaryKey(String teamPackageId);

    int insert(DtPackage record);

    int insertSelective(DtPackage record);

    DtPackage selectByPrimaryKey(String teamPackageId);

    int updateByPrimaryKeySelective(DtPackage record);

    int updateByPrimaryKey(DtPackage record);
    
    /**
     * 根据家医团队id查询套餐
     * @param map 
     * @return
     */
	List<DtPackage> listByDtTeamId(Map<String, Object> map);

	/**
	 * 查询套餐信息
	 * @param map
	 * @return
	 */
	DtPackagePojo getDtPackageByTeamPackageId(Map<String, Object> map);

	/**
	 * 查询孕妈套餐信息(总数)
	 * @param packageName	套餐名称
	 * @param packageKind	套餐种类
	 * @return
	 */
	int countPmpInfo(@Param("packageName") String packageName, @Param("packageKind") Integer packageKind);

	/**
	 * 查询孕妈套餐信息
	 * @param packageName	套餐名称
	 * @param packageKind	套餐种类
	 * @param start			开始条数
	 * @param pageSize		每页条数
	 * @return
	 */
	List<DtPackTeamPojo> queryPmpInfo(@Param("packageName") String packageName, 
									  @Param("packageKind") Integer packageKind,
									  @Param("start") int start, 
									  @Param("pageSize") int pageSize);
}