package com;

public class Use {

	String s1;

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1024;
	}

	public static void main(String[] args) {

		Use u1 = new Use();
		Use u2 = new Use();

		u1.s1 = "Praveen";
		u2.s1 = "James";

		System.out.println("U1 Hashcode: " + u1.hashCode());
		System.out.println("U2 Hashcode: " + u2.hashCode());
		
		System.out.println("---------------------------------");
		
		System.out.println("U1 Identity Hashcode: "+System.identityHashCode(u1));
		System.out.println("U2 Identity Hashcode: "+System.identityHashCode(u2));


	}

}
