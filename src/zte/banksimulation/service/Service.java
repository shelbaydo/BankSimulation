package zte.banksimulation.service;

import java.sql.SQLException;

import java.util.List;

import zte.banksimulation.dao.impl.*;

import zte.banksimulation.entity.Card;

public class Service {
	
	private CardDao cardDao = new CardDao();
	/**
	 * 给指定账户存钱
	 * @param cno
	 * @param money
	 * @return 存入成功返回true，否则返回false
	 */
	public boolean saveMoney(String cno,double money){
		boolean result = false;
		Card card = this.findCardByID(cno);
		if(card!=null)	{
			card.setMoney(card.getMoney()+money);
			if(this.updateCard(card)==1){
				result = true;
			}
		}
		return result;
	}
	/**
	 * 从指定银行卡中取钱
	 * @param cno
	 * @param pwd
	 * @param money
	 * @return 返回回执信息
	 */
	public String drawMoney(String cno,String pwd,double money){
		String message="取款成功";
		
		Card card = this.findCardByID(cno);
		if(card!=null){
			if(pwd.equals(card.getPwd())==true){
				if(money%100==0){
					if(money<=card.getMoney()){
						card.setMoney(card.getMoney()-money);
						this.updateCard(card);	
					}else{
						message="余额不足";
					}
				}else{
					message="只能取整百";
				}
			}else{
				message="密码错误";
			}
		}else{
			message="无此银行卡记录";
		}
			
		return message;
	}
	/**
	 * 
	 * 添加一张银行卡
	 * 添加成功返回1
	 * @param 
	 * @return
	 */
	public int addCard(Card c) {
		return cardDao.addObject(c);
		
	}
	/**
	 *注销一张银行卡
	 *注销成功返回1
	 * @param cno
	 * @return
	 */
	public int deleteCard(String cno) {
		return cardDao.deleteObject(cno);
	}
	/**
	 * 查询所有银行卡信息
	 * 返回所有银行卡集合
	 * @return
	 */
	public List<Card> findAll() {
		return cardDao.findAll();
		
	}
	/**
	 * 根据ID查询指定银行卡
	 * 返回指定银行卡对象
	 * @param cno
	 * @return
	 */
	public Card findCardByID(String cno) {
		return (Card)cardDao.findObjectByID(cno);
	
	}
	/**
	 * 更新银行卡
	 * @param 银行卡对象
	 * @return 成功则返回1
	 */
	public int updateCard(Card c) {
		return cardDao.updateObject(c);
		
	}
}
