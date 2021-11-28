package com.automation.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample1 {

	public static void main(String[] args) {
		List<User> userlist = new ArrayList<>();
		User user1 = new User(11,"suwa8");
		User user2 = new User(2,"kuwa2");
		User user3 = new User(5,"luwa5");
		User user4 = new User(4,"ruwa1");
		User user5 = new User(10,"quwa9");
		userlist.add(user1);
		userlist.add(user2);
		userlist.add(user3);
		userlist.add(user4);
		userlist.add(user5);
		for(User user: userlist) {
			System.out.println(user);
		}
		
		//Anonymously implement comparator
		Collections.sort(userlist, new Comparator<User>() {

			@Override
			public int compare(User use1, User use2) {
				//return use1.getUserid() - use2.getUserid();
				return use1.getName().compareTo(use2.getName());
			}
			
		});
		System.out.println("\n\nAfter sorting\n\n");
		for(User user: userlist) {
			System.out.println(user);
		}
		
/*		Collections.sort(userlist,new UserComparator());
		for(User user: userlist) {
			System.out.println(user);
		}
	*/	
		//Using Arrays.sort method
/*		User[] userArr = {user1,user2,user3,user4,user5};
		Arrays.sort(userArr , new UserComparator());
		System.out.println("\n\nAfter sorting\n\n");
		for(User u: userArr) {
			System.out.println(u);
		}*/
	}
}
