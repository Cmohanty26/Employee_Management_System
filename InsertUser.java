package com.EmployeManagementProject;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {
	static Scanner sc=new Scanner(System.in);
	public static boolean add() {
		boolean flag=false;
		System.out.println("Please enter id");
		int id=sc.nextInt();
		System.out.println("Please enter name");
		String name=sc.next();
		System.out.println("Please enter age");
		int age=sc.nextInt();
		System.out.println("Please enter salary");
		int sal=sc.nextInt();
		String query="insert into  employee values(?,?,?,?)";
		try {
			PreparedStatement s=EmployeeManagementMain.con.prepareStatement(query);
			s.setInt(1,id);
			s.setString(2, name);
			s.setInt(3, age);
			s.setInt(4, sal);
			s.execute();
			flag=true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
		return flag;
		
	}

}
