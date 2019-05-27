package com;

public class IntegerDemo {
	
	public static void main(String[] args) {
		
		
		Integer i=1000;
		Integer ii=new Integer(2500);
		
		System.out.println(i);
		System.out.println(i.hashCode());
		i=2000;
		
		System.out.println("-------------");
		
		System.out.println(i);
		System.out.println(i.hashCode());
		
		System.out.println("+++++++++++++++++++++");
		
		System.out.println("II: "+ii);
		System.out.println("II Hashcode: "+ii.hashCode());
		
		ii=3000;
		System.out.println("----------------");
		System.out.println("II: "+ii);
		System.out.println("II Hashcode: "+ii.hashCode());
		
		System.out.println("=================================================");
		
		System.out.println("I hashcode: "+System.identityHashCode(i));
		System.out.println("II Hashcode: "+System.identityHashCode(ii));
		
		i=10;
		ii=1500;
		
		System.out.println("-------------------------");
		
		System.out.println("I hashcode: "+System.identityHashCode(i));
		System.out.println("II Hashcode: "+System.identityHashCode(ii));
		

		
	}

}
