package com.corejava.jdbc.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getConnection() {
	
	try{
		//Registering to the driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Registered to driver succefully");
		
		//open a connection
		Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rajesh cherukuri", "root", "test");
		return connection;

	}catch(SQLException e){
		e.printStackTrace();
	} catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	return null;
	}
	
	public static void closeConnection(Connection connection){
		try{
			//Close Connection
			connection.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
}
