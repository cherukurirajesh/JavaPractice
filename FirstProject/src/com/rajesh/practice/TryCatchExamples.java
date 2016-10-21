package com.rajesh.practice;

public class TryCatchExamples {

	public static void main(String[] args) {
		try {
			int A = 20;
			int B = 0;
			int c = 0;
			String FirstName;
			String LastName;
			System.out.println("Firstcut" + c);
			c =A/B;
			System.out.println("What will get printed here" + c);
		} catch (ArithmeticException e){
			System.out.println("Encoutered an arthimetic exception: Anynumber can't be devided by Zero");
		}
		
		try{
			String myname = "";
			int lengthofthestring = myname.length();
			int Testing[] = new int [10];
			Testing[14] = 22;
			char A = myname.charAt(2);
			System.out.println("length of the string is" + lengthofthestring);
		}catch (NullPointerException e){
			System.out.println("I am in first Catch Block");
		}catch (Exception e){
			System.out.println("I am in second Catch Block");
		}
		/*catch (StringIndexOutOfBoundsException e){
			System.out.println("I am in Third Catch Block");
		}*/
	//public static String add(String FirstName String LastName) {	}
		
	}

}
