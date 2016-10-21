/*
Task 
To complete this challenge, you must save a line of input from stdin to a variable, 
print Hello, World. on a single line, and finally print the value of your variable on a second line. 
*/

package com.hackerRank.dayZero;

import java.util.Scanner;

public class dayZero {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, World");
		String myString = scanner.nextLine();
		scanner.close();
		System.out.println(myString);
	}
}
