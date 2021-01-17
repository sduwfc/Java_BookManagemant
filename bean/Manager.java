package com.henu.bean;

public class Manager {
	private String username;
	private String password;
	private int islogin;
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private String code;
	private String state;
	
	public int getIslogin() {
		return islogin;
	}

	public void setIslogin(int islogin) {
		this.islogin = islogin;
	}

	public Manager(){}
	
	public Manager(String username,String password,int islogin,String code,String state){
		this.username = username;
		this.password=password;
		this.islogin = islogin;
		this.code = code;
		this.state = state;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
