package com;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Object> hs=new TreeSet<>();
		
		hs.add("Praveen");
		hs.add("James");
		hs.add("Anny");
		hs.add("Chennai");
		hs.add("Zoo");
		hs.add("Anny");
		
		System.out.println(hs);
		
		System.out.println("------------");
		
		for(Object obj:hs) {
			System.out.println(obj);
		}
		
		System.out.println("-------------------------");
		
		Iterator<Object> it=hs.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		
		
		
		
	}

}
