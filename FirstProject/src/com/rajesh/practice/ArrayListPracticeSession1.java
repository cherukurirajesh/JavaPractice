package com.rajesh.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPracticeSession1 {

	public static void main(String[] args) {

		ArrayList<String> stringlist = new ArrayList<>();
		
		stringlist.add("1");
		stringlist.add("Jamie Lannister");
		stringlist.add("John Snow");
		stringlist.add("Dier Wolf");
		stringlist.add("7");
		stringlist.add("Valar Morghalis");
		
		System.out.println("Size of the StringList is ..");
		System.out.println(stringlist.size());
		System.out.println("Displaying column wise");
		
		Iterator<String> itr = stringlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
				
		
		stringlist.add(1, "Tyrion Lannister");
		//stringlist.r
		stringlist.add(5, "Sansa Stark");
		stringlist.add("Targeriyans");
		System.out.println(stringlist.size());
		System.out.println("Displaying column wise after modifcations");
		Iterator<String> itr1 = stringlist.iterator();
		//System.out.println("size of iterator" +itr1.);
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		ArrayList<String> secondstringlist = new ArrayList<>();
		secondstringlist.add("Game Of Thrones");
		secondstringlist.add("Oathkeeper");
		secondstringlist.add("Bravos");
		secondstringlist.add("The Wall");

		System.out.println("Displaying new Array columnwise:");
		Iterator<String> itr3 =  secondstringlist.iterator();
		while (itr3.hasNext()) {
		System.out.println(itr3.next());
		
		
		}
		
		secondstringlist.addAll(stringlist);
		
		System.out.println("Universe of Arraylist");
		System.out.println("Size of secondstringlist is:"+ secondstringlist.size());
		System.out.println("Is secondstringlist empty?  "+ secondstringlist.isEmpty());
		
	}

}


