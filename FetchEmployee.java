package com.EmployeManagementProject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchEmployee {
	static Scanner sc=new Scanner(System.in);
	public static void display() {
		System.out.println("Enter your id:");
		int id=sc.nextInt();
		String q="select * from employee where id=?";
		try {
			PreparedStatement s=EmployeeManagementMain.con.prepareStatement(q);
			s.setInt(1, id);
			boolean b=s.execute();
			if(b) {
				ResultSet r=s.getResultSet();
				while(r.next()) {
					System.out.println();
					System.out.println("=========Enter id details=======");
					System.out.println("id= "+r.getInt("id"));
					System.out.println("Name= "+r.getString("name"));
					System.out.println("Age= "+r.getInt("age"));
					System.out.println("Sal= "+r.getInt("sal"));
					System.out.println("=====================");
				}
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	public static void displayAll() {
		String q="select * from employee";
		try {
			PreparedStatement s=EmployeeManagementMain.con.prepareStatement(q);
			boolean b=s.execute();
			if(b) {
				ResultSet r=s.executeQuery();
				while(r.next()) {
					System.out.println("====== All Employee Details======");
					System.out.println("id= "+r.getInt("id"));
					System.out.println("Name= "+r.getString("name"));
					System.out.println("Age= "+r.getInt("age"));
					System.out.println("Sal= "+r.getInt("sal"));
				}
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
