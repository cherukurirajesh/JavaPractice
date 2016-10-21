package com.hackerRank.dayZero;

import java.util.Scanner;

public class dayTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double mealCost = scanner.nextDouble();
		int tipPercent = scanner.nextInt();
		int taxPercent = scanner.nextInt();
		scanner.close();
		double totalCost;
		
		double tip = (mealCost *(tipPercent/100.0));
		double tax = (mealCost *(taxPercent/100.0));
		totalCost = mealCost + tip + tax;
		System.out.println("The total meal cost is " + Math.round(totalCost) + " dollars");
	}

}
