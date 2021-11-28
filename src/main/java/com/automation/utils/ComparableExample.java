package com.automation.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		List<UserWitComparable> userlist = new ArrayList<UserWitComparable>();
		UserWitComparable user1 = new UserWitComparable(11,"suwa8");
		UserWitComparable user2 = new UserWitComparable(2,"kuwa2");
		UserWitComparable user3 = new UserWitComparable(5,"luwa5");
		UserWitComparable user4 = new UserWitComparable(4,"ruwa1");
		UserWitComparable user5 = new UserWitComparable(10,"quwa9");
		userlist.add(user1);
		userlist.add(user2);
		userlist.add(user3);
		userlist.add(user4);
		userlist.add(user5);
		for(UserWitComparable user: userlist) {
			System.out.println(user);
		}
		System.out.println("\n\nAfter sorting by name\n\n");
		
		Collections.sort(userlist);
		
		for(UserWitComparable user: userlist) {
			System.out.println(user);
		}
	}

}
