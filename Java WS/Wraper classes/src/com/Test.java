package com;

public class Test {

	public static void main(String[] args) {
		
		int x=100; // accepeted all the veriosns
		float f=x; // accepted all the version
		
		
		//---------------------------------
		
		Integer intObj=1000;  // Auto Casting --- not possible in below 1.4
		Integer ii=new Integer(1000);
		
		int iii=intObj; // Object into Primitive  -> UnBoxing -- Not passible in below 1.4
		// in JDK 1,4 and below
	
		int iiii=intObj.intValue(); // convers Integer object into a primitive data type of int
		byte b=intObj.byteValue();
		long l=intObj.longValue();
		short s=intObj.shortValue();
		
		float ff=intObj.floatValue();
		double d=intObj.doubleValue();
		
		
		
		intObj=x; // primitive into object -> Boxing -- not possible in below 1.4
		
		//----------------------------------
		
		/*
		 * Notes
		 * --------
		 * from Java 5.0 and above , auto casting, auto boxing and un boxing introduced
		 * 
		 */
		
		
		
		

	}

}
