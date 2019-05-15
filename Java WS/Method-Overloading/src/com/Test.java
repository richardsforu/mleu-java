package com;

/*
 * Notes
 * ---------
 * 
 * data type	size in bytes
 * ----------------------------
 * 	int				4
 * 	short			2
 * 	byte			1
 * 	long			8
 * ----------------------------
 * 	float			4
 * 	double			8
 * ----------------------------
 * 	char			2
 * ----------------------------
 * 	
 */

public class Test {

	
	void f1(int x) {
		System.out.println("Integer: " + x);
	}
	

	
	void f1(byte x) {
		System.out.println("Byte: " + x);
	}
	
	

	void f1(short x) {
		System.out.println("Short: " + x);
	}

    
	void f1(long x) {
		System.out.println("Long: " + x);
	}

	

	void f1(float x) {
		System.out.println("Float: " + x);
	}

	
	void f1(double x) {
		System.out.println("Double: " + x);
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.f1(26.76f);
		
		

	}

}
