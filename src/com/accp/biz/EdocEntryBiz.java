package com.accp.biz;

import java.util.List;

import com.accp.entity.Edoc_entry;

public interface EdocEntryBiz {
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
	boolean addEdocEntry(Edoc_entry e);
	/**
	 * ɾ���ĵ�
	 * @param e
	 * @return
	 */
	boolean deleteEdocEntry(Edoc_entry e);
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
	boolean updateEdocEntry(Edoc_entry e);
	
}
