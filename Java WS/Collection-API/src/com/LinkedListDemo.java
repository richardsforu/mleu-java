package com;

import java.util.LinkedList;
import java.util.Vector;

/*
 * Types of Objects
 *  1. Simple Objects
 *  2. Complex Objects
 *  
 *  
 * 
 * 
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		LinkedList<Object> ar=new LinkedList<>();
		ar.add("Praveen");
		ar.add(343434);
		ar.add(847334.7665f);
		ar.add('A');
		ar.add(343434);

		
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		
		// Delete Object
		ar.remove(2);
		System.out.println(ar);
		
		// Update Praveen repplacing with James
		
		ar.set(0, "James");
		System.out.println(ar);
		
		
		

	}

}
