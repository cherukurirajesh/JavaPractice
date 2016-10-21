package com.corejava.jdbc.expenseReport;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.corejava.jdbc.bean.User;
import com.corejava.jdbc.dbutil.DBUtil;

public class ExpenseReportServiceImplementation implements ExpenseReportService {

	@Override
	public boolean registration(User user) {
		Connection connection = null;
		Statement statement = null;

		try {
			connection = DBUtil.getConnection();

			// 3.Create a statement
			statement = connection.createStatement();

			// 4.Execute Query
			String inputQuery = "insert into user_tbl(FirstName,UserID,middlename,LastName,Emailaddress,ActiveFlag,UserName,Password) values('"
					+ user.getFirstname() + "','" + user.getUserid() + "','" 
					+ user.getMiddlename() + "','" + user.getLastname() + "','" 
					+ user.getEmailaddress() + "','" + user.getActiveflag()+ "','"
					//+ user.getActivationdata() + "','" 
					+ user.getUsername() + "','" + user.getPassword() + "')";

			System.out.println("inputQuery: " + inputQuery);
			int numOfRecInserted = statement.executeUpdate(inputQuery);
			//boolean numOfRecInserted =statement.executeUpdate(inputQuery) != 0;
			System.out.println("numOfRecInserted: " + numOfRecInserted);

			return (numOfRecInserted > 0);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(connection);
		}

		return false;
	}

	
	
	
	@Override
	public boolean validateUser(User user) {
		Connection connection = null;
		Statement statement = null;
		
		try{
			
			connection = DBUtil.getConnection();

			// 3.Create a statement
			statement = connection.createStatement();
			
			
			
		} catch() {
			
		}
		
	}
	
}
