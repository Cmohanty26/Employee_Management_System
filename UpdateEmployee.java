package com.EmployeManagementProject;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployee {
	static Scanner sc=new Scanner(System.in);
	public static void update() {
		System.out.println("Enter your choice");
		boolean flag=true;
		while(flag) {
			System.out.println("For update your Name Enter:- 1");
			System.out.println("For update your Age Enter: 2");
			System.out.println("For update your Sal Enter: 3");
			System.out.println("For Exist from update Menu Enter: 4");
			System.out.println("Enter what you want:");
			int option=sc.nextInt();
			switch (option) {
			case 1:
				String q1="update employee set name=? where id=?";
				System.out.println("Enter new name which you want to update:");
				String name=sc.next();
				System.out.println("Enter your id");
				int id=sc.nextInt();
				try {
					PreparedStatement s=EmployeeManagementMain.con.prepareStatement(q1);
					s.setString(1, name);
					s.setInt(2, id);
					boolean b=s.execute();
					if(b) {
						
					}
					else {
						System.out.println("Name Update Successfully");
						System.out.println("=====================");
					}
					
				}
				catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				
				break;
				case 2:
					String q2="update employee set age=? where id=?";
					System.out.println("Enter age which you want to update:");
					int age=sc.nextInt();
					System.out.println("Enter your id:");
					int id2=sc.nextInt();
					try {
						PreparedStatement s=EmployeeManagementMain.con.prepareStatement(q2);
						s.setInt(1, age);
						s.setInt(2, id2);
						boolean b=s.execute();
						if(b) {
							
						}
						else {
							System.out.println("Age Updated Succesfully");
							System.out.println("================");
						}
					}
					catch (SQLException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					String q3="update employee set sal=? where id=?";
					System.out.println("Enter new salary which you want to update");
					int sal=sc.nextInt();
					System.out.println("Enter your id");
					int id3=sc.nextInt();
					try {
						PreparedStatement s=EmployeeManagementMain.con.prepareStatement(q3);
						s.setInt(1, sal);
						s.setInt(2, id3);
						boolean b=s.execute();
						if(b) {
							
						}
						else {
							System.out.println("salary updated Successfully");
						}
					}
					catch (SQLException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 4:
					System.out.println("==========");
					flag=false;
					break;

			default:
				System.out.println("Invalid Input");
				break;
			}
		}
	}

}
