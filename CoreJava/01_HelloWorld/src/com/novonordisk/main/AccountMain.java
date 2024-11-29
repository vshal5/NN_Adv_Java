package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.Account;

public class AccountMain {
	public static void main(String args[]) {
		int accountNumber;
		String name;
		double balance;
		
		//create obj of Scanner
		Scanner scanner = new Scanner(System.in);
		
		//accept 
		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		
		System.out.println("Enter Name");
		name = scanner.next();
		
		System.out.println("Enter balance");
		balance = scanner.nextDouble();
		
		//create obj of acc class and call display method
		Account accountObj = new Account();
		accountObj.display(accountNumber,name,balance);
		
	}
}
