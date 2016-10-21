/*
For this challenge, you need to read a line from stdin and check whether if is of type integer, float or string
 If input is 
 	Integer print'This input is of type Integer.' to the stdout.
 	Float print 'This input is of type Float.' to the stdout.
 	String print 'This input is of type String.' to the stdout.
 	Else print 'This is something else.' to the stdout.
 
 Input Format: A single line to be taken as input as Save it to a variable (name of your choice)
 Output Format: Print the text according to the data type you get as an input.
 Sample input: 23
 Sample Output: This input is of type integer
 
 Explanation:	If the given input is of type integer, then you need to print 'This input is of type integer.' to the stdout, 
 				else if the given input is of type float, then you need to print 'This input is of type float.' to the stdout,
 				else if the given input is of type string, then you need to print 'This input is of type string.' to the stdout,
 				else print 'This is something else' to the stdout.
 */

package com.TechGig.DayOne;

import java.util.Scanner;

public class DayTwoChallenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String myString = scanner.next();
		//ParseInput(myString);
		
		try {
			Long.parseLong(myString);
			//double number = scanner.nextInt();
			//System.out.println("The Integer number is:  " + number);
			System.out.println("the given input is an Integer");
		} catch (NumberFormatException nef) {
			System.out.println("Exception is in Integer block");
		} try{
			float number = scanner.nextFloat();
			System.out.println("The float number is:  " + number);
			System.out.println("the given input is an Float");
		} catch(NumberFormatException nef1) {
			System.out.println("Exception is in Float block");
		}
		scanner.close();
		}
}

/*
public static void ParseInput(String myString)
{
	try{
		Integer.parseInt(myString);
		
		
		//Long.parseLong(myString);
		System.out.println(myString + " is an Integer");
		return;
	} 
	catch (NumberFormatException nfe) 
	{
		//System.out.println(nfe);	
	}
	try{
		Float.parseFloat(myString);
		System.out.println(myString + " Is a Float");
		//float number = Float.parseFloat(myString);
		//System.out.println(number);
		//if (myString instanceof Float)
			//System.out.println("Primitive : float");
		//if (number%Math.round(number) == 0) 
		//{
			//System.out.println(myString + " Is a integer");
		//} else {
			//System.out.println(myString + " Is a Float");
		//}
		//System.out.println(myString + " is a float");
		return;
	}			
	catch (NumberFormatException nfe1)
	{
		//System.out.println(nfe1);
	}
	try {
		String v = myString.getClass().getName();
		if (v != "java.lang.String")
			System.out.println(myString + " is something else");
		else 
		System.out.println(myString + " is a String");
		return;
	}
	catch (NumberFormatException nfe2)
	{
		//System.out.println(nfe2);
	}
	finally {
		System.exit(0);
	}
}

*/