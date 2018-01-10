package com.huatuo.customer.base.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<M extends Serializable,Pk extends Serializable> {
	/**
	 * 查询
	 */
	public List<M> selectAll();
	
	public M getModel(Pk id);
	
	/**
	 * 保存
	 */
	public Pk save(M model);
	
	/**
	 * 更新
	 */
	int update(M model);
	
	/**
	 * 删除
	 */
    int delete(Pk id);
    
    int deleteByModel(M model);
    
    /**
     * 统计条数
     */
    int count();
}
