package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/hb_student_tracker";
		String user = "hbstudent";
		String password = "Pplacement@123";
		
		try {
			System.out.println("connecting  ");
			 Connection con  = DriverManager.getConnection(url, user, password);
			 System.out.println("connection succesfull  ");
			 
			
		} catch (SQLException e) {
			// TODO: handle exception
			
			System.out.println("exception" +  e);
		}

	}

}
