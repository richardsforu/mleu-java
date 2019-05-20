package com;

/*
 * Abstract class
 * -------------------
 * 		-> Abstract  class is a method specification which contains zero or more abstract methods, and concrete methods
 * 		-> Abstract methods do not have method body. Its only method specification
 * 		-> We can not create an object to a abstract class, as there are incomplete methods defined
 * 		-> But we can create a reference to the abstract class
 * 		-> Reference of an abstract class can hold all its implementation/sub class objects
 * 		-> Reference of an abstract class which is pointing to its sub class, can access all the methods from the 
 *         Abstract class and the overridden methods from the sub class
 *      -> The reference of an Abstract class can not be accessed the individual methods of a sub class. 
 *      -> All the sub classes of an Abstract class must override all the abstract methods defined in the abstract class
 *      -> If Any one of the sub class of an abstract class is not overriding any one of the abstract method, then that
 *         sub class must be defined as 'abstract'
 *       
 *       Note: A class can not be defined both 'abstract' and 'final' at once.
 * 
 */

public abstract class Employee {

	int empId;
	String empName;
	double salary;
	
	abstract void acceptEmployee(int empId,String empName); // all sub classes of this class must over ride this method
	abstract void processSalary(); // all sub classes of this class must over ride this method
	abstract void projectAllocation();
	abstract void deptAllocation();
	void display() { // Concrete method
		System.out.println("EmpId: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("--------------------------");

	}
	
	

}
