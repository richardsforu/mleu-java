package com;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		
		TreeMap<Object, Object>  hm=new TreeMap<>();
	
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
