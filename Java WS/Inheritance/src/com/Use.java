package com;

public class Use {

	public static void main(String[] args) {

		SalariedEmployee se = new SalariedEmployee();
		se.acceptEmployee(10, "Praveen");
		se.processSalary();

		ContractEmployee ce = new ContractEmployee();
		ce.acceptEmployee(11, "James");
		ce.processSalary();

		se.display();
		ce.display();

	}

}
