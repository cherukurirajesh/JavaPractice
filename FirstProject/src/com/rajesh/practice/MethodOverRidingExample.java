package com.rajesh.practice;

public class MethodOverRidingExample {
	public static void main(String[] args) {
	        Cat myCat = new Cat();
	        Animal myAnimal = myCat;
	        Animal.testClassMethod();
	       // Cat.testClassMethod();
	        myAnimal.testInstanceMethod();
	    }
	}