package com;

public class ContractEmployee extends Employee {
	
	int noOfHoursWorked;

	@Override
	void acceptEmployee(int empId, String empName) {

		this.empId=empId;
		this.empName=empName;
		noOfHoursWorked=350;
	}

	@Override
	void processSalary() {

		int hourCost=1000;
		this.salary=hourCost*noOfHoursWorked;
		System.out.println("--- ContractEmployee Process Salary");

	}

}
