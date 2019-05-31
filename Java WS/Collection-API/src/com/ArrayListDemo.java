package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * Types of Objects
 *  1. Simple Objects
 *  2. Complex Objects
 *  
 *  
 * 
 * 
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<Object> ar=new ArrayList<>();
		ar.add("Praveen");
		ar.add(343434);
		ar.add(847334.7665f);
		ar.add('A');
		ar.add(343434);
		ar.add("Cognizant");
		ar.add(34834);
		ar.add('K');

		
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		
		// Delete Object
		ar.remove(2);
		System.out.println(ar);
		
		// Update Praveen repplacing with James
		
		ar.set(0, "James");
		System.out.println(ar);
		
		System.out.println("-----------------");
		
		
		// display all elements  from collection
		
		
		//1. for loop
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//2. for each loop
		
		System.out.println("---------------");
		
		for(Object obj:ar) {
			System.out.println(obj);
		}
		
		System.out.println("----------------");
		
		// 3. Iterator
		
		Iterator<Object> it=ar.iterator();
		
		while(it.hasNext()) {
			
			Object obj=it.next();
			if(obj.equals("James")) {
				it.remove();
				continue;
			}
			System.out.println(obj);
			
		}
		
		
		
		System.out.println("-----------");
		System.out.println(ar);
		
		System.out.println("-----------------");
		
		// 4. ListIterator
		
		ListIterator<Object> li=ar.listIterator();
		
		while(li.hasNext()) {
			Object obj=li.next();
			if(obj.equals(34834)) {
				li.add("M");
			}
			System.out.println(obj);
		}
		
		System.out.println("--------------");
		
		while(li.hasPrevious()) {
			Object obj=li.previous();
			System.out.println(obj);
		}
		
		System.out.println("-------------------");
		
		System.out.println(ar);

	}

}
