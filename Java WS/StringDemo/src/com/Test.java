package com;

/*
 * 
 *		Types of Objects
 *-------------------------------
 *		1. immutable
 *		2. mutable
 *
 *		
 * 		1. Immutable
 * -----------------------
 * 		-> content of the object can not be modified.
 * 		Ex: String and all warper classes
 * 
 *      2. Mutable
 *      ------------
 *      -> COntent can be modified
 *      -> Ex: StringBuffer
 *      
 *      
 * 
 */

public class Test {

	public static void main(String[] args) {

		String s1 = new String("Abc12");
		System.out.println("S1: " + s1);
		System.out.println("S1 Hashcode: " + s1.hashCode());
		System.out.println("S1 Identity-Hashcode: " + System.identityHashCode(s1));
		//s1="Praveren";
	//	System.out.println("S1: " + s1);
	//	System.out.println("S1 Hashcode: " + System.identityHashCode(s1));

		String s2 = new String("Abc123");

		System.out.println("------------------------------------");

		System.out.println("S2: " + s2);
		System.out.println("S2 Hashcode: " + s2.hashCode());
		System.out.println("S2 Identity-Hashcode: " + System.identityHashCode(s2));

		if (s1.equals(s2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		/*
		 * Notes
		 * ---------
		 * 	-> == always compares hashcodes of two given objects
		 * 	-> equals() method campares the obejct content
		 */

	}

}
