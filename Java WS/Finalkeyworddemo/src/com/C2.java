package com;

/*
 *   final keryword
 *   -----------------
 *   1. If final is defined with a class name, then that class can not be sub classed
 *   2. If final is defined with a method name, then that method can not be overridden in the sun classes
 *   3. If final is defined with class level variables/ properties / fields then that variable value can not be modified
 *      any where in the same class as well in all is't sub classes.
 * 
 */

class C{
	
}

 final class Test extends C{
	
	int empId;
	
	
}

//class Sample extends Test{ // Can not extends Test class as it is defined as final class
	
//}
class C1 {
	
	int age=98;
	
 final int X=76;
 final static String CITY="Chennami";

	final void f1() {
		//X=100; //  can not assign because X is defined as final
		System.out.println("C1 class f1 method");
	}
	
	void f2() {
		
		final int Y;
		
	}

}

public class C2 extends C1 {

	@Override
	void f2() {
		//X=988;
		System.out.println("C1 class f1 method");
	}
	
	final public static void main(String[] args) {
		
		C1 c1=new C2();
		System.out.println(c1.X);
		System.out.println(C1.CITY);
		
		
	}
	
	

}
