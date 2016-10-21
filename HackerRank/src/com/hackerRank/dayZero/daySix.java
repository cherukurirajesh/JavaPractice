package com.hackerRank.dayZero;

import java.util.Scanner;

public class daySix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int j;
		int T = scanner.nextInt();
		/*
		 args = new String [T]
		 There is already a String array named args in this main function, So I'm using it.
		 */
		args = new String [T];
		for(j=0;j<=T-1;j++) {
			args[j] = scanner.next();
		}
		scanner.close();
						
		for(j=0;j<=T-1;j++) {
			int i;
			String Str1 = "";
			String Str2 = ""; 
			for(i=0;i<=args[j].length()-1;i++) {
				if ((i)%2 == 0)
					{
						char S2 = args[j].charAt(i);
						Str1 += S2;
					} else {
						char S3 = args[j].charAt(i);
						Str2 += S3;
					}
				}
			System.out.println(Str1+" "+ Str2);
			}
			}
		}
		