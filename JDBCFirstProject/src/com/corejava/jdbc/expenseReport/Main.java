package com.corejava.jdbc.expenseReport;

import com.corejava.jdbc.bean.User;
import com.corejava.jdbc.expenseReport.ExpenseReportService;
import com.corejava.jdbc.expenseReport.ExpenseReportServiceImplementation;

public class Main {
	
	public static void main(String[] args) {
		ExpenseReportService ExpenseReportService = new ExpenseReportServiceImplementation();
		
		User user = new User();
		user.setEmailaddress("test@test.com");
		user.setFirstname("test first");
		user.setLastname("test last");
		user.setUsername("testuser");
		user.setPassword("testpassword");
		
		boolean registrationFlag = ExpenseReportService.registration(user);
		System.out.println("registrationFlag: "+registrationFlag);
	}

}
