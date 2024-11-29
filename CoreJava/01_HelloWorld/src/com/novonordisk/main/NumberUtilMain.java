package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.NumberUtil;

public class NumberUtilMain {
	public static void main(String[] args) {
		int number;
		//scannerl
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		
		//create obj of other class
		NumberUtil numberUtil = new NumberUtil();
		int output = numberUtil.getValueOfNumber(number);
		
		System.out.println("Result: " + output);
		scanner.close();
	}
}
