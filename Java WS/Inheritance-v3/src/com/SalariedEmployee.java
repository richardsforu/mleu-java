package com;

public class SalariedEmployee extends Employee {

	int noOfDaysWorked;

	@Override
	void acceptEmployee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
		noOfDaysWorked = 22;
	}

	/*
	@Override // annotation
	void processSalary() {
		int perDayPrice = 1500;
		this.salary = perDayPrice * noOfDaysWorked;
	}
	*/

	void projectData() {
		System.out.println("---- Project data of a Salaried Employee");
	}

}
