package zte.banksimulation.dao.impl;

import java.sql.SQLException;
import java.util.List;



import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;




import utils.C3P0Utils;
import zte.banksimulation.dao.Dao;
import zte.banksimulation.entity.Card;

public class CardDao implements Dao {

	public int addObject(Object o) {
		Card card = null;
		card=(Card)o;
		QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "insert into card values(?,?,?,?)";
		int row=0;
		try {
			row = queryRunner .update(sql,card.getCno(),card.getCname(),card.getPwd(),card.getMoney());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
		
	}

	public int deleteObject(String cno) {
		QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "delete from card where cno = ?";
		int row=0;
		try {
			row = queryRunner.update(sql, cno);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	public List findAll() {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from card";
		List<Card> cards=null;
		try {
			 cards = qr.query(sql, new BeanListHandler<Card>(Card.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cards;
		
		
	}

	public Object findObjectByID(String cno) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql =" select * from card where cno=?";
		//执行SQL语句，并把查询的结果封装成对象
		Card c = null;
		try {
			c = qr.query(sql, new BeanHandler<Card>(Card.class),cno);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	
	}

	public int updateObject(Object o) {
		Card c = (Card)o;
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "update card set cno=?,cname=?,pwd=?,money=? where cno=?";
		int row=0;//影响行数
		try {
			row = qr.update(sql, c.getCno(),c.getCname(),c.getPwd(),c.getMoney(),c.getCno());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
		
		
	}

}
