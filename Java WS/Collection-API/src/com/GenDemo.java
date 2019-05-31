package com;


public class GenDemo<U> {
	
	
	void f1(U x) {
		System.out.println(x.getClass().getTypeName()+" "+x);
	}
	
	
	
	
	public static void main(String[] args) {
		
		GenDemo<Integer> g=new GenDemo<>();
		g.f1(9493);
		//g.f1(665.34f);
		
		
		
	}

}
