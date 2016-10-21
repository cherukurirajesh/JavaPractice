package com.TechGig.DayOne;

import java.util.Scanner;
public class CandidateCode {

	public static void main(String[] args) {

    	System.out.println("Hello TechGig");

    	Scanner scanner = new Scanner(System.in);
        
    	System.out.print("Enter something : ");
        String input = scanner.nextLine();
        
        System.out.println("input : " + input);
        System.out.println("-----------\n");
    	scanner.close();
	}
	
}
