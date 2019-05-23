package com;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Abc");

		System.out.println("Sb1: " + sb1);
		System.out.println("SB1 Hashcode: " + sb1.hashCode());
		System.out.println("SB1 Identity Hashcode: " + System.identityHashCode(sb1));

		System.out.println("----------------------------------------------------------");

		sb1.append("Xyz");
		
		System.out.println("Sb1: " + sb1);
		System.out.println("SB1 Hashcode: " + sb1.hashCode());
		System.out.println("SB1 Identity Hashcode: " + System.identityHashCode(sb1));

		System.out.println("----------------------------------------------------------");
		
		StringBuffer sb2 = sb1.reverse();

		System.out.println("Sb2: " + sb2);
		System.out.println("SB2 Hashcode: " + sb2.hashCode());
		System.out.println("SB2 Identity Hashcode: " + System.identityHashCode(sb2));

		sb2.reverse(); // even it modifies sb1 too
		
		System.out.println("----------------------------------------------------------");

		
		System.out.println("Sb1: " + sb1);
		System.out.println("SB1 Hashcode: " + sb1.hashCode());
		System.out.println("SB1 Identity Hashcode: " + System.identityHashCode(sb1));

		
		System.out.println("----------------------------------");
		System.out.println("Sb2: " + sb2);
		System.out.println("SB2 Hashcode: " + sb2.hashCode());
		System.out.println("SB2 Identity Hashcode: " + System.identityHashCode(sb2));

		
		if (sb1.equals(sb2)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}

	}

}
