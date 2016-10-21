package com.rajesh.practice;

public class ThrowExamples {

	public static void main(String[] args) {
		try{
			int division = div(4,0);
			System.out.println("The Reminder is: "+ division);
		} catch (Exception e){
			System.out.println("This Exception in thrown from THROW statement");
		}
		
		try{
			String MyName = fullname("", "Cherukuri");
			System.out.println("My Full Name is: "+ MyName);
		} catch (Exception e) {
			System.out.println("This message is from the string throw..");
		}
	} 
	static int div(int A, int B) {
		if (B == 0){
			throw new ArithmeticException("Devider can't be Zero");
		}
		else
		return A/B;
	}
	
	static String fullname(String FirstName, String LastName){
		String fullname = FirstName.concat(LastName);
		if (FirstName == ""){
			throw new NullPointerException("First Name Can't be Null");
		} 
		return fullname;
	}
}
