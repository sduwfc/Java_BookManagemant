package com.henu.bean;


public class Info {
	private String id;  //学号
	private String bookname;  //书名
	private String type;  //类型
	private String date;  //借书日期
	private int days;  //借阅天数
	private int Con;  //借阅数量
	
	public Info(){}
	
	public Info(String id,String bookname,String type,String date,int days,int cou){
		this.id = id;
		this.bookname = bookname;
		this.type = type;
		this.date = date;
		this.days = days;
		this.Con = cou;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getCon() {
		return Con;
	}
	public void setCon(int con) {
		Con = con;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
}
