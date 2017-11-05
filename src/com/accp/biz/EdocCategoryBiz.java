package com.accp.biz;

import java.util.List;

import com.accp.entity.Edoc_category;

public interface EdocCategoryBiz {
	/**
	 * 获得所有的分类
	 * @return
	 */
	List<Edoc_category> queryEdocCategorys();
}
