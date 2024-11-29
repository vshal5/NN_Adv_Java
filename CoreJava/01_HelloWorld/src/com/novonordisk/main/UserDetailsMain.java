package com.novonordisk.main;

import java.util.Scanner;

public class UserDetailsMain {
	public static void main(String[] args) {
		
		//declaration & initialization
		String name;
		int age;
		System.out.println("Enter your name");
		
		//creating object of Scanner Class
		Scanner scanner = new Scanner(System.in);
		
		name = scanner.nextLine();
		System.out.println("Name = " + name);
		
		System.out.println("Enter your age");
		age = scanner.nextInt();
		System.out.println("Age = " + age);
		
	}
}
