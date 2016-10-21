package com.rajesh.JDBCPractice;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class AddingRecord {

	public static void main(String[] args) {
		Connection connection = null;

		try{
			
			//Registering a Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Registered succefully");
			
			//Connecting to a DB
			connection =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rajesh cherukuri", "root", "test");
			System.out.println("Connected succefully");
			
			//Creating a statement
			System.out.println("Creating a statement");
			Statement statement = (Statement) connection.createStatement();
			
			/*
			// 4.Execute Query
			String inputQuery = "insert into user_tbl values('903676121','rajesh','','cherukuri','A06040','rcherukuri@spglobal.com','1',CURRENT_TIMESTAMP,'12')";
			System.out.println("inputQuery: " + inputQuery);

			int numOfRecInserted = statement.executeUpdate(inputQuery);

			
			String inputQuery2 = "insert into user_tbl values('903676126','Ramashiva','','Thadakamalla  ','A06038','rthadakamalla@spglobal.com','1',CURRENT_TIMESTAMP,'12')";
			System.out.println("inputQuery: " + inputQuery2);

			int numOfRecInserted2 = statement.executeUpdate(inputQuery2);

			String inputQuery3 = "insert into user_tbl values('903689769','Sreenivas','Chaitanya','Tammineni','906033','stammineni@capitaliq.com','1',CURRENT_TIMESTAMP,'12')";
			System.out.println("inputQuery: " + inputQuery3);

			int numOfRecInserted3 = statement.executeUpdate(inputQuery3);
			*/
			
			
			//5.Retrieving results from the table
			String inputquery = "Select firstname,middlename,lastname from User_tbl";
			ResultSet rs = (ResultSet) statement.executeQuery(inputquery);
			System.out.println(rs);
			
			while(rs.next()){
		         //Retrieve by column name
		         String firstname  = rs.getString("firstname");
		         String middlename = rs.getString("middlename");
		         String lastname   = rs.getString("lastname");
		         
		         //Display values
		         System.out.print(" FullName: " + firstname);
		         System.out.print(middlename);
		         System.out.print(lastname);
			}
						
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

}




/*
package com.rajesh.JDBCPractice;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class AddingRecord {

	public static void main(String[] args) {
		Connection connection = null;

		try{
			Date date = new Date(115, 0, 02, 07, 30);
			String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS").format(date);
			System.out.println(dateTime);
			
			//Registering a Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Registered succefully");
			
			//Connecting to a DB
			connection =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rajesh cherukuri", "root", "test");
			System.out.println("Connected succefully");
			
			//Creating a statement
			System.out.println("Creating a statement");
			Statement statement = (Statement) connection.createStatement();
			
			// 4.Execute Quiery
			String inputQuery = "insert into user_tbl values('9003','rajesh','','cherukuri','A06040','rcherukuri','1','"+dateTime+"','12')";
			System.out.println("inputQuery: " + inputQuery);

			int numOfRecInserted = statement.executeUpdate(inputQuery);

		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

}


*/