package com.akatri.login;

public class LoginService {
	public boolean validateUser(String name, String password) {
		if (name.equals("Akash") && password.equals("1234")) {
			return true;
		}
		return false;
	}
}
