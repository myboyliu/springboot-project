package com.huatuo.customer.base.query;

import java.io.Serializable;

/**
 * 高级查询父类
 * @author master
 *
 */
public abstract class BaseQuery implements Serializable{
	
	private static final long serialVersionUID = 2665995896211811490L;
	/**
	 * 当前起始位置
	 */
	private Integer start;
	/**
	 * 当前页
	 */
	private Integer currentPage = 1;
	/**
	 * 每页条数
	 */
	private Integer pageSize = 15;
	/**
	 * 模糊匹配关键字
	 */
	private String keyWord;
	/**
	 * 与登录用户后对应的令牌
	 */
	private String token;
	/**
	 * 开始时间
	 */
	private String starttime;
	/**
	 * 结束时间
	 */
	private String endtime;	
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	
	
}
