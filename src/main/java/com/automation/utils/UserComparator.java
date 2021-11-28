package com.automation.utils;

import java.util.Comparator;

public class UserComparator implements Comparator<User>{

	@Override
	public int compare(User user1, User user2) {
		//return user1.getUserid() - user2.getUserid();
		return user1.getName().compareTo(user2.getName());
	}

}
