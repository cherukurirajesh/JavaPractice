package com.hackerRank.dayZero;

import java.util.Scanner;

public class dayNine {

	
	private static int nFactorial (int N) {
		System.out.println();
		if (N>1) {
			return N * nFactorial(N-1);
		}
		else {
			return N;	
		}
	}
	public static void main(String[] args) {
		int N,X;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		int result = nFactorial(N);
		System.out.println(result);
		scanner.close();
	}

}
