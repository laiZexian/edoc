package com.accp.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.biz.EdocCategoryBiz;
import com.accp.dao.EdocCategoryDao;
import com.accp.entity.Edoc_category;
@Service
public class EdocCategoryBizImpl implements EdocCategoryBiz {
	@Resource
	private EdocCategoryDao edocCategoryDao =null;
	@Override
	public List<Edoc_category> queryEdocCategorys() {
		// TODO Auto-generated method stub
		return edocCategoryDao.queryEdocCategorys();
	}

}
