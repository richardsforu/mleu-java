package com;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		
		
		Hashtable<Object, Object>  hm=new Hashtable<>();
	
		hm.put(10, "Praveen");
		hm.put(113, "James");
		hm.put(232, "Deepa");	
		hm.put(323, "Prakash");
		hm.put(11232, "Michel");
		hm.put(232, "Deepa");	
		hm.put(233, "James");	

		
		System.out.println(hm);
		
		

	}

}
