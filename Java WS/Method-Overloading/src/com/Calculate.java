package com;

/*
 * Notes
 * --------
 * What is method signature?
 * 	1. name of method
 * 	2. number of arguments
 * 	3. type of arguments
 * 	4. position of arguments
 */


public class Calculate {

	void f1() {
		System.out.println("---- f1 method");
	}
	
	void f1(int x) {
		System.out.println("Integer: "+x);
	}
	
	void f1(int x,int y) {
		
	}
	void f1(int x,float y) {
		
	}
	
	void f1(float x,int y) {
		
	}
	
	//int f1() {
	//	return 0;
	//}
	
	public static void main(String[] args) {
		
		Calculate c=new Calculate();
		c.f1();
		//c.f2(6555);
		
		
	}
	
	
}
