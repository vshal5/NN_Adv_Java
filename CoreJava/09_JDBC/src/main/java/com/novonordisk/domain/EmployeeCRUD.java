package com.novonordisk.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeCRUD {

	private String userName = "root";
	private String password = "Root123$";
	private String databaseURL = "jdbc:mysql://localhost:3306/trainingdb";
	private String select_all = "Select * from employee_details";
	private String select_one = "Select * from employee_details where employee_id = ?";
	private String insert_one = "insert into employee_details values(?,?,?)";
	private String update_one = "update employee_details set name =?, salary=? where employee_id=?";
	
//update one	
	public void updateEmployee(int employee_id, String name ,double salary) {
		try {
			Connection connection = DriverManager.getConnection(databaseURL, userName, password);
			// System.out.println("Connection Successful!");
			PreparedStatement preparedStatement = connection.prepareStatement(update_one);
			preparedStatement.setInt(3, employee_id);
			preparedStatement.setString(1, name);
			preparedStatement.setDouble(2, salary);
			preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Connection Failed");
			System.out.println("Invalid Login Details");
			e.printStackTrace();
		}
	}
	
	
//insert 1 employee
	public void createEmployee(int employee_id, String name ,double salary) {
		try {
			Connection connection = DriverManager.getConnection(databaseURL, userName, password);
			// System.out.println("Connection Successful!");
			PreparedStatement preparedStatement = connection.prepareStatement(insert_one);
			preparedStatement.setInt(1, employee_id);
			preparedStatement.setString(2, name);
			preparedStatement.setDouble(3, salary);
			preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Connection Failed");
			System.out.println("Invalid Login Details");
			e.printStackTrace();
		}
	}
//select one
	public void getEmployeeByEmployeeId(int employee_id) {
		try {
			Connection connection = DriverManager.getConnection(databaseURL, userName, password);
			// System.out.println("Connection Successful!");
			PreparedStatement preparedStatement = connection.prepareStatement(select_one);
			preparedStatement.setInt(1, employee_id);
			ResultSet result = preparedStatement.executeQuery();

			while (result.next()) {
				System.out.print(result.getInt("employee_id"));
				System.out.print("\t" + result.getString("name"));
				System.out.println("\t" + result.getDouble("salary"));
			}
			connection.close();
		} catch (SQLException e) {
			System.out.println("Connection Failed");
			System.out.println("Invalid Login Details");
			e.printStackTrace();

		}
	}
//select all
	public void getAllEmployees() {
		try {
			Connection connection = DriverManager.getConnection(databaseURL, userName, password);
			// System.out.println("Connection Successful !");
			/// prepareStatemnet is function
			PreparedStatement preparedStatement = connection.prepareStatement(select_all);
			// stored in Result set
			ResultSet result = preparedStatement.executeQuery();

			while (result.next()) {
				System.out.print(result.getInt("employee_id"));
				System.out.print("\t" + result.getString("name"));
				System.out.println("\t" + result.getDouble("salary"));
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// -e.printStackTrace();
			System.out.println("Connection Failed");
			System.out.println("Invalid Login Details");

		}
	}
}
