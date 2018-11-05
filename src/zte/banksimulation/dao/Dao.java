package zte.banksimulation.dao;

import java.util.List;

public interface Dao {
	/**
	 * ��Ӷ������ݿ�
	 * ������Ӱ�������
	 * @param o
	 * @return
	 */
	public int addObject(Object o);
	/**
	 * ����idɾ������
	 * ������Ӱ�������
	 * @param cno
	 * @return
	 */
	public int deleteObject(String cno);
	/**
	 * �������ݿ��еĶ���
	 * ������Ӱ�������
	 * @param o
	 * @return
	 */
	public int updateObject(Object o);
	/**
	 * ����ID����ָ������
	 * ���ط��������Ķ���
	 */
	public Object findObjectByID(String cno);
	/**
	 * ��ѯȫ������
	 * ����ȫ�����󼯺�
	 * @return
	 */
	public List findAll();
	
	
}
