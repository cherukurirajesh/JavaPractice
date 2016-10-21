package com.hackerRank.dayZero;

import java.util.Scanner;

public class dayFive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.close();
		
		int i, result;
		for(i=1;i<=10;i++)
		{
			result = N*i;
			System.out.println(N  + " * " + i + " = " + result);
		}
		
	}

}
