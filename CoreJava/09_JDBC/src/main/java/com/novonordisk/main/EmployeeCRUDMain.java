package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.EmployeeCRUD;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		EmployeeCRUD employeeCRUD = new EmployeeCRUD();

		int employeeId;
		String name;
		double salary;

		Scanner scanner = new Scanner(System.in);
		
		//print all
		employeeCRUD.getAllEmployees();
		System.out.println("-----------------------------------");

//delete one		
		System.out.println("Enter EmployeeId to be deleted");
		employeeId = scanner.nextInt();

		employeeCRUD.deleteEmployee(employeeId);
		
// update a employee
//		System.out.println("Enter EmployeeId to be updated");
//		employeeId = scanner.nextInt();
//
//		System.out.println("Enter name");
//		name = scanner.next();
//
//		System.out.println("Enter salary");
//		salary = scanner.nextDouble();
//		employeeCRUD.updateEmployee(employeeId, name, salary);
		
//insert one employee
//		System.out.println("Enter EmployeeId");
//		employeeId = scanner.nextInt();
//
//		System.out.println("Enter name");
//		name = scanner.next();
//
//		System.out.println("Enter salary");
//		salary = scanner.nextDouble();		
//    	employeeCRUD.createEmployee(employeeId, name, salary);		
		
		//------
//select one employee
//		System.out.println("Enter EmployeeId");
//		employeeId = scanner.nextInt();
//
//		System.out.println("Enter name");
//		name = scanner.next();
//
//		System.out.println("Enter salary");
//		salary = scanner.nextDouble();

		System.out.println("-----------------------------------");

		employeeCRUD.getAllEmployees();
		scanner.close();
	
	}
}
