package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.Addition;

public class AdditionMain {
	public static void main(String[] args) {
		System.out.println("AdditionMain start");
		
		//Declaration
		int n1;
		int n2;
		
		//Initialization
		//n1=10;
		//n2=20;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter values of number1");		
		n1 = scanner.nextInt();
		System.out.println("Enter values of number2");
		n2 = scanner.nextInt();
		

		System.out.println("value of n1 = " + n1);
		System.out.println("value of n2 = " + n2);
		
		//
		//create object of addition class and call accept
		Addition addObject =  new Addition();
		addObject.accept(n1, n2);
		
		System.out.println("AdditionMain end");
}
}
