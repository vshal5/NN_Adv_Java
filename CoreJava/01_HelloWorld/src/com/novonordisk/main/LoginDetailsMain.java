package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.LoginDetails;

public class LoginDetailsMain {
	public static void main(String[] args) {
		//init & dec
		String username, password;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter user name");
		username=scanner.next();
		System.out.println("Enter password");
		password=scanner.next();
		
		//obj of other class
		LoginDetails loginDetails = new LoginDetails();
		boolean result = loginDetails.validate(username,password);
		System.out.println(result);
		
		if(result==true)
			System.out.println("Login Successful");
		else
			System.out.println("Login failed");
		scanner.close();		
	}
}
