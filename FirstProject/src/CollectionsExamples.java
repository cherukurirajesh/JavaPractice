
import java.util.ArrayList;

public class CollectionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub




package harsha.monday.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExtension {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
		arrayList.add("Four");
		arrayList.add("Five");
		arrayList.add("Six");
		arrayList.add("Seven");
		arrayList.add("Eight");
		arrayList.add("Nine");
		arrayList.add("Ten");
		arrayList.add("Eleven");

		System.out.println("size: " + arrayList.size());

		System.out.println("get:" + arrayList.get(4));

		ArrayList<String> arrayListTwo = new ArrayList<String>();
		arrayListTwo.add("Twelve");
		arrayListTwo.add("Thirteen");
		arrayListTwo.add("Fourteen");
		arrayListTwo.add("Fifteen");

		ArrayList<String> arrayListThree = new ArrayList<String>();
		arrayListThree.add("Sixteen");
		arrayListThree.add("Seventeen");
		arrayListThree.add("Eighteen");
		arrayListThree.add("Nineteen");

		arrayList.addAll(arrayListThree);
		arrayList.addAll(11, arrayListTwo);

		ArrayList<String> arrayListFour = new ArrayList<String>();
		System.out.println("isEmpty:" + arrayListFour.isEmpty());
		System.out.println(arrayListFour);
		arrayListFour.add("Twenty");
		System.out.println("isEmpty:" + arrayListFour.isEmpty());
		System.out.println(arrayListFour);

		ArrayList<String> arrayListFive = (ArrayList<String>) arrayListFour.clone();
		System.out.println("five: " + arrayListFive);

		System.out.println(arrayList);

		arrayListFour.clear();
		System.out.println(arrayListFour);
		System.out.println("five: " + arrayListFive);
		System.out.println("hashcode:" + arrayList.hashCode());
		System.out.println("hashcodeTwo:" + arrayListTwo.hashCode());
		System.out.println("hashcodeThree:" + arrayListThree.hashCode());
		System.out.println("indexOf:" + arrayList.indexOf("Five"));
		System.out.println("remove:" + arrayList.remove("Eleven"));

		System.out.println("contains:" + arrayList.contains("Ten"));
		System.out.println("containsAll:" + arrayList.containsAll(arrayListTwo));
		System.out.println("containsAll:" + arrayList.equals(arrayList));
		System.out.println("subList:" + arrayList.subList(1, 5));

		System.out.println(arrayList + ", size: " + arrayList.size());

		// Iterator
		System.out.println("Iterator...");
		Iterator<String> iterator = arrayList.iterator();
		int index = 0;
		while (iterator.hasNext()) {
			String arrayListElement = iterator.next();
			System.out.println(arrayListElement);

			if (index == 11) {
				iterator.remove();
			}

			index++;
		}
		System.out.println(arrayList + ", size: " + arrayList.size());

		// ListIterator

		ListIterator<String> listIterator = arrayList.listIterator();
		index = 0;
		
		while(listIterator.hasNext()) {
			String arrayListElement = listIterator.next(); 
			System.out.println("listIterator: "+arrayListElement);
			if(index == 15) {
				listIterator.set("Fifteen");
				listIterator.add("Sixteen");
			}
			if(index == 17) {
				listIterator.remove();
				listIterator.set("Seventeen");
				listIterator.add("Eighteen");
			}
			
			index++;
		}
		System.out.println("listIterator: "+arrayList+", size: "+arrayList.size());
		

		while(listIterator.hasPrevious()) {
			String arrayListElement = listIterator.previous(); 
			System.out.println("listIterator: "+arrayListElement);
		}
		
		System.out.println("listIterator: "+arrayList+", size: "+arrayList.size());
		
		Collections.synchronizedList(arrayList);

	}

}

2)vector example...

package harsha.monday.java;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExtension {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>();

		vector.add("1");
		vector.add("2");
		vector.add("3");
		vector.add("4");
		vector.add("5");
		vector.add("6");
		vector.add("7");
		vector.add("8");
		vector.add("9");
		vector.add("10");
		System.out.println(vector);

		Vector<String> vectorTwo = new Vector<String>();
		vectorTwo.add("11");
		vectorTwo.add("12");
		vectorTwo.add("13");
		vectorTwo.add("14");
		vectorTwo.add("15");

		Vector<String> vectorThree = new Vector<String>();
		vectorThree.add("16");
		vectorThree.add("17");
		vectorThree.add("18");
		vectorThree.add("19");
		vectorThree.add("20");

		Vector<String> vectorFour = new Vector<String>();
		System.out.println("isEmpty: " + vectorFour.isEmpty());
		System.out.println(vectorFour);
		vectorFour.add("21");
		System.out.println("isEmpty:" + vectorFour.isEmpty());
		System.out.println(vectorFour);

		vector.addAll(vectorThree);
		vector.addAll(10, vectorTwo);

		System.out.println(vector);

		Vector<String> vectorFive = (Vector<String>) vectorFour.clone();
		System.out.println("five: " + vectorFive);

		System.out.println(vector);

	

		// Iterator 
		
		System.out.println("Iterator...");
		Iterator<String> iterator = vector.iterator();
		int index = 0;
		
		while(iterator.hasNext()) {
			String vectorElement = iterator.next(); 
			System.out.println(vectorElement);
			
			if(index == 11) {
				iterator.remove();
			}
			
			index++;
		}	
			System.out.println(vector+", size: "+vector.size());
		
		
		// ListIterator
		
ListIterator<String> listIterator = vector.listIterator();
		
		 index =0 ;
		while(listIterator.hasNext()) {
			
			String vectorElement =listIterator.next(); 
			System.out.println("listIterator: "+vectorElement);	
			if(index == 11) {
				listIterator.set("104");
				listIterator.add("108");
				
			}
			if(index ==1) {
				listIterator.remove();
				listIterator.add("51");
			}
			
			index++;
		
		}
			//ListIterator Previous
		while(listIterator.hasPrevious()) {
			String vectorElement = listIterator.previous(); 
			System.out.println("listIterator: "+vectorElement);
		}
	
	
	
		System.out.println("listIterator: "+vector+", size: "+vector.size());
		

	}
		
	
}
		
	}

}
