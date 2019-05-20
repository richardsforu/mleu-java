package com;

public class SalariedEmployeeV1 extends EmployeeV1 {
	int noOfDaysWorked;

	@Override
	void processSalary() {

		this.salary = noOfDaysWorked * 2500;
	}

}
