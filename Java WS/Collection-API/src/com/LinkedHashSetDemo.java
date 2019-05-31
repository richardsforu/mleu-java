package com;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Object> hs=new LinkedHashSet<>();
		
		hs.add("Praveen");
		hs.add("James");
		hs.add("Anny");
		hs.add(3843);
		hs.add('A');
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
