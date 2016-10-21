package com.hackerRank.dayZero;

import java.util.Scanner;

public class daySeven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i,j;
		int N = scanner.nextInt();
		int _arraySize = 1000;
		int[] intArray = new int[_arraySize];
		
		for(i=0;i<=N-1;i++){
			intArray[i] = scanner.nextInt();
		}
		scanner.close();
		StringBuffer sb = new StringBuffer();
		for(j=N-1;j>=0;j--) {
			sb.append(intArray[j]);
			sb.append(" ");
			sb.capacity();
			System.out.println(sb.capacity());
		}
		System.out.println(sb.toString());
	}
}
