package com.accp.dao;

import java.util.List;

import com.accp.entity.Edoc_category;

public interface EdocCategoryDao {
	/**
	 * ������еķ���
	 * @return
	 */
	List<Edoc_category> queryEdocCategorys();
}
