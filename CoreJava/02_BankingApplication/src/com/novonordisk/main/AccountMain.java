package com.novonordisk.main;

import com.novonordisk.domain.Account;

public class AccountMain {
	public static void main(String[] args) {
	
		//create object and set values using constructor
		//print values using getter
		Account account = new Account(101, "Vishal M", 10000);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		
		System.out.println("---------------");
		//same using setter
		Account account2 = new Account();
		account2.setAccountNumber(123);
		account2.setName("NN");
		account2.setBalance(123871);
		
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());
	}
}
