package com;

/*
 * 	Hash code
 * ------------
 * 		-> Unique code to represent java class objects
 * 		-> with out new operator, Java uses a technique (ASCII) to identify common content
 * 		-> with new operator , java uses a technique (hashing ds) to identify unique objects
 * 
 * 
 */
public class HashCodeDemo {

	String name;
	
	@Override
		public int hashCode() {
			
			return name.hashCode();
		}

	public static void main(String[] args) {
		
		  // out out new operator
		 // all the time content of an object is verified
		
		HashCodeDemo h1=new HashCodeDemo();
		
		h1.name="Praveen REDDY S";
		HashCodeDemo h2=new HashCodeDemo();
		
		h2.name="Praveen";
		
	
		
		  String s1="A";
		  String s2="A";
		  
		  System.out.println("H1 Name: "+h1.name);
		  System.out.println("H2 Name: "+h2.name);

		  
		  System.out.println(h1.hashCode());
		  System.out.println(h2.hashCode());
		
		  System.out.println("---------------------");
		  
		  System.out.println(System.identityHashCode(h1));
		  
		  //Integer i1=new Integer(10000);
		//  Integer i2=new Integer(10000);
		  
		  
		
		
	}
}
