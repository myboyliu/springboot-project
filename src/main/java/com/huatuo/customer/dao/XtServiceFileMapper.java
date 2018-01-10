package com.huatuo.customer.dao;


import java.util.List;

import com.huatuo.customer.domain.XtServiceFile;
import com.huatuo.customer.query.ServiceFileQuery;

public interface XtServiceFileMapper {
    int deleteByPrimaryKey(Long id);

    int insert(XtServiceFile record);

    int insertSelective(XtServiceFile record);

    XtServiceFile selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(XtServiceFile record);

    int updateByPrimaryKey(XtServiceFile record);
    /**
     * 根据主题id查询主题的图片和音频
     * @param id
     * @return
     */
	List<XtServiceFile> getFilesByConsultId(Long consultId);
	
	/**
	 * 根据条件查询文件对象
	 * @param serviceFileQuery
	 * @return
	 */
	List<XtServiceFile> selectXtServiceFilesByQuery(ServiceFileQuery serviceFileQuery);
}