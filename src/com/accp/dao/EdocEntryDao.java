package com.accp.dao;

import java.util.List;

import com.accp.entity.Edoc_entry;

public interface EdocEntryDao {
	/**
	 * ����ĵ���Ϣ
	 * @return
	 */
	List<Edoc_entry> queryEdocEntrys(Edoc_entry e);
	/**
	 * ����ĵ�
	 * @param e
	 * @return
	 */
	int addEdocEntry(Edoc_entry e);
	/**
	 * ɾ���ĵ�
	 * @param e
	 * @return
	 */
	int deleteEdocEntry(Edoc_entry e);
	/**
	 * ��õ������ĵ�
	 * @param e
	 * @return
	 */
	Edoc_entry queryEdocEntry(Edoc_entry e);
	/**
	 * �޸�
	 * @param e
	 * @return
	 */
	int updateEdocEntry(Edoc_entry e);
	
}
