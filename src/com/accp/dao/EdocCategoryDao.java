package com.accp.dao;

import java.util.List;

import com.accp.entity.Edoc_category;

public interface EdocCategoryDao {
	/**
	 * 获得所有的分类
	 * @return
	 */
	List<Edoc_category> queryEdocCategorys();
}
