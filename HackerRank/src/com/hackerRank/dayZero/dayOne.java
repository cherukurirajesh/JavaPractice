package com.hackerRank.dayZero;

import java.util.Scanner;

public class dayOne {

	public static void main(String[] args) {

		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		try {
			Scanner scanner = new Scanner(System.in);
			String I2s = scanner.nextLine();
			int I2 = Integer.parseInt(I2s);
			String d2s = scanner.nextLine();
			double d2 = Double.parseDouble(d2s);
			String s2 = scanner.nextLine();
					
			System.out.println(i+I2);
			System.out.println(d+d2);
			System.out.println(s+s2);
			scanner.close();
			
		} catch (NumberFormatException nfe) {
			System.out.println("I'm in the catch block");
		}
		
	}

}
