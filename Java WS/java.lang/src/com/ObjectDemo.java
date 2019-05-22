package com;

/*
 * 
 * 
 * 	java.lang.Object
 * 	--------------------
 * 	1.this class is super class to all the classes in java by default
 *  2. This class contains the methods which are common to all the classes in java
 *  
 *   methods in object class
 *   -------------------------
 *   1. toString
 *   2. hashcode
 *   3. equals
 *   4. clone
 *   5. wait
 *   6. notify
 *   7. notifyAll
 * 
 */
public class ObjectDemo {
	
	String name="Praveen";
	int age=98;
	
   @Override
	public String toString() {
		
		return "Hello "+name+" and given age is "+age;
	}
	
	
	
	
	public static void main(String[] args) {
		
		ObjectDemo obj=new ObjectDemo();
		System.out.println(obj.toString());
	//	System.out.println(obj.hashCode());
	//	System.out.println(Integer.toHexString(obj.hashCode()));
		
	}

}
