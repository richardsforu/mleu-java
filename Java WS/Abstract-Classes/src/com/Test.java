package com;

public class Test {

	public static void main(String[] args) {

		Employee emp;
		emp = new SalariedEmployee();
		emp.acceptEmployee(10, "Praveen");
		emp.processSalary();
		emp.display();

		emp = new ContractEmployee();
		emp.acceptEmployee(11, "James");
		emp.processSalary();
		emp.display();

	}

}
