package com;

public  class SalariedEmployee extends EmployeeV1 {

	int noOfDaysWorked;

	@Override
	void acceptEmployee(int empId, String empName) {

		this.empId = empId;
		this.empName = empName;
		noOfDaysWorked = 22;

	}

	

}
