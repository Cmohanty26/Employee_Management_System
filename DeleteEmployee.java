package com.EmployeManagementProject;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {
	static Scanner sc=new Scanner(System.in);
	public static void delete() {
		System.out.println("Enter your employee id");
		int id=sc.nextInt();
		try {
			String q="delete from employee where id=?";
			PreparedStatement s=EmployeeManagementMain.con.prepareStatement(q);
			s.setInt(1, id);
			boolean b=s.execute();
			if(b) {
				
			}
			else {
				System.out.println("Delete Successfully");
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
