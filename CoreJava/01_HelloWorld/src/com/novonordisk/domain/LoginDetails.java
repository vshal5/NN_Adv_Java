package com.novonordisk.domain;

public class LoginDetails {
	public boolean validate(String username, String password){
		if(username.equals("Admin") && password.equals("Admin@123#"))
			return true;
		else 
			return false;
		
	}

}