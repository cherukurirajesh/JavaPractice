package com.corejava.jdbc.expenseReport;

import com.corejava.jdbc.bean.User;

public interface ExpenseReportService {

	boolean registration(User user);
	boolean validateUser(User user);
		
}
