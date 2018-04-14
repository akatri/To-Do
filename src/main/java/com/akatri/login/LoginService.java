package com.akatri.login;

import com.akatri.users.UserService;

public class LoginService {
	UserService service = new UserService();

	public boolean validateUser(String name, String password) {

		String uniqueId = name + password;
		if (service.isUserAvailable(uniqueId)) {
			if (name.equals(service.getUser(uniqueId).getName())
					&& password.equals(service.getUser(uniqueId).getPassword())) {
				return true;
			}
		}
		return false;
	}
}
