package com;

/*
 * 
 * Notes
 * ------
 * 	1. Super class object can store or hold all its sub class objects
 *  2. Super class reference can be used to access all the methods from super class, and overridden methods
 *     from sub class
 *  3. Super class reference can not be used to access the individual methods of a sub class( A method which is defined
 *     in the sub class and not available / defined in the super class ).
 *  
 *  Best Practice Tips
 *  ---------------------
 *  1. Creating sub class object directly is disencouraged in java. Insted, Store the Sub class object in the super class
 *     referance object
 *  2. We can achieve data absytractin by doing it.
 *  3. If you create an object to a sub class directly, sub class object will access all the data from sub class and 
 *     super class. here no way of hiding any content to the sub class object.        
 */

public class Use {

	public static void main(String[] args) {

		Employee emp;

		emp = new SalariedEmployee();

		emp.acceptEmployee(10, "Abc");
		emp.processSalary();
		emp.display();
		//emp.info();
		
		//emp.projectData(); // in Valid
		
		//SalariedEmployee se=new SalariedEmployee();
		//se.projectData();

		
		emp = new ContractEmployee();
		emp.acceptEmployee(11, "Xyz");
		emp.processSalary();
		emp.display();
		emp.info();
		
		
	//	ContractEmployee ce=(ContractEmployee)new Employee();
		
		
		
		

	}

}
