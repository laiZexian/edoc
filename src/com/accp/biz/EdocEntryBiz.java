package com.accp.biz;

import java.util.List;

import com.accp.entity.Edoc_entry;

public interface EdocEntryBiz {
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
	boolean addEdocEntry(Edoc_entry e);
	/**
	 * 删除文档
	 * @param e
	 * @return
	 */
	boolean deleteEdocEntry(Edoc_entry e);
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
	boolean updateEdocEntry(Edoc_entry e);
	
}
