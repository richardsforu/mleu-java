package com;

public class ContractEmployee extends EmployeeV1 {

	int noOfHoursWorked;

	@Override
	void acceptEmployee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
		noOfHoursWorked = 250;

	}

	@Override
	void processSalary() {

		this.salary = noOfHoursWorked * 3000;

	}

}
