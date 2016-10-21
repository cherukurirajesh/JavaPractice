package com.hackerRank.dayZero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dayEight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i,j,phoneNumber;
		String Name = "";
		Map<String,Integer> phoneBook = new HashMap<String,Integer>();
		ArrayList<String> al = new ArrayList<String>();
		
		for(i=0;i<=N-1;i++) {
			Name = scanner.next();
			phoneNumber = scanner.nextInt();
			phoneBook.put(Name, phoneNumber);
		}
		while(scanner.hasNext()){
			al.add(scanner.next());
		}
		scanner.close();
		for(j=0;j<=al.size()-1;j++){
			if(phoneBook.containsKey(al.get(j)) == true){
				System.out.println(al.get(j) + "=" + phoneBook.get(al.get(j)));
			} else {
				System.out.println("Not found");
			}
		}
	}
}