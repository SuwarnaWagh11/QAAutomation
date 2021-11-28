package com.automation.utils;

public class UserWitComparable implements Comparable<UserWitComparable>{

	private int userid;
	private String name;

	public UserWitComparable(int user_id, String user_name) {
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

	@Override
	public int compareTo(UserWitComparable user) {
		return name.compareTo(user.getName());
		//return  user.getUserid() - userid; //1 - 3 = -2 (-2 means this.userid will be place before another user.getUserid())
	}

}
