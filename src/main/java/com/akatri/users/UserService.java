package com.akatri.users;


import java.util.HashMap;

import java.util.Map;


public class UserService {
	private static Map<String,User> users = new HashMap<>();

	public void createUser(String unique,String name, String password,Long phone) {

		users.put(unique,new User(name, password,phone));

	}
	
	public User getUser(String uniqueId) {
		User temp=users.get(uniqueId);
		return temp;
		
	}
	public boolean isUserAvailable(String uId) {
		return users.containsKey(uId);
	}
}
