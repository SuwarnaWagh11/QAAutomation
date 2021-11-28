package com.automation.utils;

public class User {

	private int userid;
	private String name;

	public User(int user_id, String user_name) {
		this.userid = user_id;
		this.name = user_name;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[userid=" + userid + ", name=" + name + "]";
	}

}
