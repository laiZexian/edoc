package com.accp.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.biz.EdocEntryBiz;
import com.accp.dao.EdocEntryDao;
import com.accp.entity.Edoc_entry;
@Service
public class EdocEntryBizImpl implements EdocEntryBiz {
	@Resource
	private EdocEntryDao edocEntryDao =null;
	@Override
	public List<Edoc_entry> queryEdocEntrys(Edoc_entry e) {
		// TODO Auto-generated method stub
		return edocEntryDao.queryEdocEntrys(e);
	}

	@Override
	public boolean addEdocEntry(Edoc_entry e) {
		// TODO Auto-generated method stub
		return edocEntryDao.addEdocEntry(e)>0;
	}

	@Override
	public boolean deleteEdocEntry(Edoc_entry e) {
		// TODO Auto-generated method stub
		return edocEntryDao.deleteEdocEntry(e)>0;
	}

	@Override
	public Edoc_entry queryEdocEntry(Edoc_entry e) {
		// TODO Auto-generated method stub
		return edocEntryDao.queryEdocEntry(e);
	}

	@Override
	public boolean updateEdocEntry(Edoc_entry e) {
		// TODO Auto-generated method stub
		return edocEntryDao.updateEdocEntry(e)>0;
	}

}
