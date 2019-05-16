package com;
/*
 * 
 * Inheritance:
 * -> Accessing data from the super class/parent clas is called Inheritance
 * -> Re-usability
 * 
 * Notes:
 * --------
 * 1. Sub class can access data of a super class
 * 2. Super class can not access data from sub class
 * 3. extends keyword to make super class to any class in java.
 * 
 * 	Method Overriding
 * --------------------
 * 	-> Dynamic polymorphism
 * 
 * 
 * 
 */

class C1 {

	public void display() {
		System.out.println("--- C1 class");
	}

}

class C2 extends C1{

	public void display() {
		super.display(); 
		System.out.println("--- C2 class");
	}

}

public class Test {

	public static void main(String[] args) {
		
		// Create Object to Sub class
		
		C2 c2=new C2();
		c2.display();
		
		

	}

}
