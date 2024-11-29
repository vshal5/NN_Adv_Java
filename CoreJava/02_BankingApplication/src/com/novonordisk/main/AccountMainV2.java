package com.novonordisk.main;

import java.util.Scanner;
import com.novonordisk.domain.Account;

public class AccountMainV2 {
	public static void main(String[] args) {
		
		//var dec
		int accountNumber,choice;
		String name, continueChoice;
		double balance, amount;
		boolean result;
		
		//initialization/accept input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter account Number");
		accountNumber = scanner.nextInt();
		System.out.println("Enter account Name");
		name = scanner.next();
		System.out.println("Enter account Balance");
		balance = scanner.nextDouble();

		//create a obj of class Account
		Account account = new Account(accountNumber, name, balance);
		
		//display
		do {
			System.out.println("Menu");
			System.out.println("1: Withdraw");
			System.out.println("2: Deposit");
			System.out.println("3: Check Balance");
			System.out.println("Enter your choice");
			
			choice=scanner.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("You have selected Withdraw");
				System.out.println("Enter the to withdraw");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if(result==true) 
					System.out.println("Withdraw Sucessful");
			    else 
			    	System.out.println("Withdraw failed");
				break;
				
			case 2:
				System.out.println("you have selected Deposit");
				System.out.println("Enter the to Deposit");
				amount = scanner.nextDouble();
				result = account.deposit(amount);
				if(result==true) 
					System.out.println("Deposit Sucessful");
				else
					System.out.println("Deposit failed");
				break;
				
			case 3:
				System.out.println("you have selected Check Balance");
				System.out.println("your Balance is " + account.getBalance());
				break;
				
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue? y || n");
			continueChoice = scanner.next();
		}while(continueChoice.equals("y"));	
		System.out.println("Thank you");
	}
}
