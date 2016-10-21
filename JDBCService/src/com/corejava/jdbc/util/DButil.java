package com.corejava.jdbc.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;


public class DButil {

		
		public static Connection getConnection() {
			try {
				// 1. Register JDBC Driver
				System.out.println("Resister Driver");
				Class.forName("com.mysql.jdbc.Driver");
				
				// 2.Open a connection
				return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/harsha", "root", "root");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return null;
		}
		
		public static void closeConnection(java.sql.Connection connection) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

