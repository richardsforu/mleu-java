package com;

public class Employee {
	int empId;
	String empName;
	double salary;

	void acceptEmployee(int empId, String empName) {

	}

	void info() {
		System.out.println("---- Info about an Employee");
	}

	void processSalary() {

		System.out.println("--- Employee Process Salary");

	}

	void display() {
		System.out.println("Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("--------------------");
	}

}
