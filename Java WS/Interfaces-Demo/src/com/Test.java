package com;


/*
 * 
 * 	Interfaces
 * -----------------
 * 	1. Interface is a method specification which contains zero or more abstract  methods only
 * 	2. Interfaces can not have concrete classes, constructors, blocks except abstract methods
 * 	3. By default very method in the interface is public and abstract
 * 	4. By default every variable in the interface is public final and static
 * 
 *  5. We can not create object to interface. But we can create a reference object to an interface
 *  6. A class must use 'implements' key  word to override abstract methods on an interface
 *  7. All sub class of an interface must over all the abstract methods of an interface
 *  8. if any class is not overriding any one of abstract method of in interface, then that class must be defined as abstract
 *  
 *  9. Interface reference can store or hold all its implementation class objects
 *  
 *  
 *  Note:
 *  ---------
 *  	-> If a interface has no methods, then its called 'marker' or 'tagged'  interface
 *  
 *  	-> A class can implement interface
 *  	-> A class can extends to another class
 *  	-> A class can not extends to an interface
 *  	-> A class can not implement to a another class
 *  
 *  	-> A class can not extends more than one class at at time
 *  	-> A class can implements more than one interface at a time.
 *  
 *  	-> An interface can not extends to a class
 *  	-> An interface can extends to another interface
 *  	-> An interface can extends more than one interface
 *  	
 *  	->  An interface can not implements another interface
 *  
 *  
 *  
 *    Types of Inheritance 
 *    ---------------------
 *    1. Single
 *    		class A extends B{ } // class A has single super class
 *    2. Multiple
 *    		class A implements I1,I2,I3,I4{  }  // class  a has sever super classes
 *    
 *    Note:
 *    ------
 *    We acheive multiple inheritance ib java only through interfaces
 *    
 *  
 *  
 *  
 *  
 * 
 * 
 */
public class Test {
	
	public static void main(String[] args) {
		
		MyInter mi=new C1();
		mi.f1();
		
		mi=new C2();
		mi.f1();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
