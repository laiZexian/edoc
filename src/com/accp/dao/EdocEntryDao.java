package com.accp.dao;

import java.util.List;

import com.accp.entity.Edoc_entry;

public interface EdocEntryDao {
	/**
	 * 获得文档信息
	 * @return
	 */
	List<Edoc_entry> queryEdocEntrys(Edoc_entry e);
	/**
	 * 添加文档
	 * @param e
	 * @return
	 */
	int addEdocEntry(Edoc_entry e);
	/**
	 * 删除文档
	 * @param e
	 * @return
	 */
	int deleteEdocEntry(Edoc_entry e);
	/**
	 * 获得单个的文档
	 * @param e
	 * @return
	 */
	Edoc_entry queryEdocEntry(Edoc_entry e);
	/**
	 * 修改
	 * @param e
	 * @return
	 */
	int updateEdocEntry(Edoc_entry e);
	
}
