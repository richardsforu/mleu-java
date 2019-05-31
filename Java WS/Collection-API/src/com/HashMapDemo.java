package com;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		HashMap<Object, Object>  hm=new HashMap<>();
		hm.put(10, "Praveen");
		hm.put(113, "James");
		hm.put(232, "Deepa");	
		hm.put(323, "Prakash");
		hm.put(null, "Michel");
		hm.put(232, "Deepa");	
		hm.put(null, "James");	

		
		System.out.println(hm);
		
		

	}

}
