package com.novonordisk.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculations {
	private int number1;
	private int number2;
	private int result;

	public void accept() {
		try{
			System.out.println("accept() start");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("accept() end");
		System.out.println("Enter number1");
		number1 = scanner.nextInt();
		System.out.println("Enter number2");
		number2 = scanner.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Invalid Input");
			System.out.println("Enter a valid Input");			
		}
	}

	public void calculateResult() {
		System.out.println("calculateResult() start");
		result = number1 + number2;
		System.out.println("calculateResult() end");
	}

	public void display() {
		System.out.println("display() start");
		System.out.println("Result = " + result);
		System.out.println("display() end");
	}
}
