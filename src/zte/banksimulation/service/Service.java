package zte.banksimulation.service;

import java.sql.SQLException;

import java.util.List;

import zte.banksimulation.dao.impl.*;

import zte.banksimulation.entity.Card;

public class Service {
	
	private CardDao cardDao = new CardDao();
	/**
	 * ��ָ���˻���Ǯ
	 * @param cno
	 * @param money
	 * @return ����ɹ�����true�����򷵻�false
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
	 * ��ָ�����п���ȡǮ
	 * @param cno
	 * @param pwd
	 * @param money
	 * @return ���ػ�ִ��Ϣ
	 */
	public String drawMoney(String cno,String pwd,double money){
		String message="ȡ��ɹ�";
		
		Card card = this.findCardByID(cno);
		if(card!=null){
			if(pwd.equals(card.getPwd())==true){
				if(money%100==0){
					if(money<=card.getMoney()){
						card.setMoney(card.getMoney()-money);
						this.updateCard(card);	
					}else{
						message="����";
					}
				}else{
					message="ֻ��ȡ����";
				}
			}else{
				message="�������";
			}
		}else{
			message="�޴����п���¼";
		}
			
		return message;
	}
	/**
	 * 
	 * ���һ�����п�
	 * ��ӳɹ�����1
	 * @param 
	 * @return
	 */
	public int addCard(Card c) {
		return cardDao.addObject(c);
		
	}
	/**
	 *ע��һ�����п�
	 *ע���ɹ�����1
	 * @param cno
	 * @return
	 */
	public int deleteCard(String cno) {
		return cardDao.deleteObject(cno);
	}
	/**
	 * ��ѯ�������п���Ϣ
	 * �����������п�����
	 * @return
	 */
	public List<Card> findAll() {
		return cardDao.findAll();
		
	}
	/**
	 * ����ID��ѯָ�����п�
	 * ����ָ�����п�����
	 * @param cno
	 * @return
	 */
	public Card findCardByID(String cno) {
		return (Card)cardDao.findObjectByID(cno);
	
	}
	/**
	 * �������п�
	 * @param ���п�����
	 * @return �ɹ��򷵻�1
	 */
	public int updateCard(Card c) {
		return cardDao.updateObject(c);
		
	}
}
