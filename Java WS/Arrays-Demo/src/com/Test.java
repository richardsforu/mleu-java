package com;

/*
 * Notes
 * -----------
 * 	-> 	An array is a collection of same data type
 * 	->  Index starts with zero and ends total size-1
 *	->	Every array in java by default an object 
 *
 *	Two Types
 *	-----------
 *		1. 1-D
 *		2. M-D
 */
public class Test {

	public static void main(String[] args) {
		
		//int x=10;
		//System.out.println(x);
		//x=20;
		//System.out.println(x);
		
		//int x[]= {10,20};
		//System.out.println(x[1]);
		
		// syntax array
		
		//int i[]; // Valid
		//int i[]= {10,20,34,76}; // Valid
		//int[] i; // Valid
		//int[] i= {34,54,32};
		//int i[]= {12,45}; // Valid
		//int []i= {} // Invalid
		//[]int i={} ; // invalid
		
		//---------------------------
		
		//int[] i=new int[10]; // initizes to store 10 numbers 
		//int i[]=new int[10]; // valid
		//int[10] i=new int[]; // invalid
		//int[10] i=new int[10];// Invalid
		//int[10]; // Invalid
		//int[] i=new int[]= {10,20}; // Invalid
		//int[] i=new int[2]= {12,87}; // invalid
		
		int[] x= {43,25,65,21,78,65};
		
		for(int i=0;i<x.length;i++) { // can be used on non arrays
		//	System.out.println(x[i]);
		}
		
		// for each
		System.out.println("--------------------------");
		
		for(int n:x) { // works only for aray
			//System.out.println(n);
		}
		
		// 2-D 
		
		
		int[][] i= { {10,20},{30,40},{65,54,76}};
		int[][] y= { {10,20,30},{50,32},{23,12,4,5}};
		
		System.out.println(i[0][0]);
		System.out.println(i[0][1]);
		System.out.println(i[1][0]);
		System.out.println(i[1][1]);
		
		System.out.println("-----------------------");
		
		// for number of rows
		for(int row=0;row<i.length;row++) {
			// for number of columns in a row
			
			for(int col=0;col< i[row].length;col++ ) {
				System.out.print(i[row][col]+" ");
			}
			
			System.out.println();
		}
		
		
		
		

	}

}
