package com;

import java.util.Objects;

public class Employee {

	int empId;
	String empName;

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public int hashCode() {

		return Objects.hash(empId, empName);
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;

		return (empId == emp.empId && empName.equals(emp.empName));
		//return Objects.equals(this, emp);

	}

	public void display() {
		System.out.println("Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("------------------");
	}

	public static void main(String[] args) {

		Employee e1 = new Employee(10, "Praveen");
		Employee e2 = new Employee(10, "Praveen");

		e1.display();
		e2.display();

		System.out.println("E1 Hashcode: " + e1.hashCode());
		System.out.println("E2 Hashcode: " + e2.hashCode());

		System.out.println("------------------------------------");
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));

		System.out.println("----------------------------------------");

		if (e1.equals(e2)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}

	}

}
