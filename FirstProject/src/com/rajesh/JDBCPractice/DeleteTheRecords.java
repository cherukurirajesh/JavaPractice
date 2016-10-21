package com.rajesh.JDBCPractice;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DeleteTheRecords {

	public static void main(String[] args) {

		/*
			1) Registering the Driver
			2) Get the Connection String
			3) Create a Statement
			4) Execute a Query
		 	Write Getter and Setter methods
		 */
		
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connection established Successfully");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rajesh cherukuri", "root", "test");
			System.out.println("Connected to the DB successfully");
			statement = (Statement) connection.createStatement();
			System.out.println("Created Statement Successfully");
			
			String inputQuery = "Delete from user_tbl Where UserID = 9002";
			System.out.println("Executed the 1st Delete statement successfully");
			int numOfRecDeleted = statement.executeUpdate(inputQuery);
			
			String inputQuery1 = "Delete from user_tbl Where UserID = 9003";
			System.out.println("Executed the 1st Delete statement successfully");
			int numOfRecDeleted1 = statement.executeUpdate(inputQuery1);
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try{
			connection.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
}
