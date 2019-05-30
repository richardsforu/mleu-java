package com;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 54;
	
	private int empId;
	private String empName;
	private double salary;
	
	private transient String info;
	
	void f1() {}
	void f2() {}
	void f3() {}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
