package com.diary.app.user.dao;

public class UserBean {
	private String user_uid;
	private String user_avartar;
	private String user_name;
	private String user_email;
	private String user_pw;
	
	public UserBean() {}

	public String getUser_uid() {
		return user_uid;
	}

	public void setUser_uid(String user_uid) {
		this.user_uid = user_uid;
	}

	public String getUser_avartar() {
		return user_avartar;
	}

	public void setUser_avartar(String user_avartar) {
		this.user_avartar = user_avartar;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
}    
