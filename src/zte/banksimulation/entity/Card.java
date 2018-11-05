package zte.banksimulation.entity;
/*
 * ø®∫≈: cno varchar
	–’√˚: cname varchar
        √‹¬Î£∫pwd   varchar
	”‡∂Ó: balance  money
 * */
public class Card {
	private String cno;
	private String cname;
	private String pwd;
	private double money;
	public String getCno() {
		return cno;
	}
	public Card(){}
	public Card(String cno, String cname, String pwd, double money) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.pwd = pwd;
		this.money = money;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
}
