package com;

public class NumberOperations {
	
	public static void main(String[] args) {
		
		String s1="5000";
		
		Integer i1=new Integer(s1);
		Integer i2=new Integer("5000");

		System.out.println((i1+i2));
		
		// if you dont use new Operator?
		
		int x=Integer.parseInt(s1);
		System.out.println("X: "+(x*x));
		
		
		
	}

}
