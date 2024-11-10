package com.EmployeManagementProject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class EmployeeManagementMain {
	//private static String url="jdbc:mysql://localhost:3306/employee_management","root","Chandan@123";
	
	//private  static String user="root";
	//private static String password="Chandan@123";
	public static Connection con;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","Chandan@123");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	

	public static void main(String[] args) {
		System.out.println("Welcome to employee Management Database");
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
		System.out.println("For Inserting Employee Details Enter: 1");
		System.out.println("For Updating Employee Details Enter: 2");
		System.out.println("For Deleting Employee Details Enter: 3");
		System.out.println("For Fetching  Employee Details Enter: 4");
		System.out.println("For Fetching All the Employee Details Enter: 5");
		System.out.println("For Exist from the  Employee Application Enter: 6");
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		switch (choice) {
		case 1:
			InsertUser.add();
			break;
		case 2:
			UpdateEmployee.update();
			break;
		case 3:
			DeleteEmployee.delete();
			break;
		case 4:
			FetchEmployee.display();
			break;
		case 5:
			FetchEmployee.displayAll();
			break;
		case 6:
			flag=false;
			break;
			
			

		default:
			System.out.println("Invalid input Enter which Number are given there");
			System.out.println("==========================");
			break;
		}

	}
		try {
			con.close();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
