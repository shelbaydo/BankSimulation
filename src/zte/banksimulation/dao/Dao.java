package zte.banksimulation.dao;

import java.util.List;

public interface Dao {
	/**
	 * 添加对象到数据库
	 * 返回受影响的行数
	 * @param o
	 * @return
	 */
	public int addObject(Object o);
	/**
	 * 根据id删除对象
	 * 返回受影响的行数
	 * @param cno
	 * @return
	 */
	public int deleteObject(String cno);
	/**
	 * 更新数据库中的对象
	 * 返回受影响的行数
	 * @param o
	 * @return
	 */
	public int updateObject(Object o);
	/**
	 * 根据ID查找指定对象
	 * 返回符合条件的对象
	 */
	public Object findObjectByID(String cno);
	/**
	 * 查询全部对象
	 * 返回全部对象集合
	 * @return
	 */
	public List findAll();
	
	
}
