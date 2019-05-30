package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerDemo {
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(497394);
		emp.setInfo("Information About Employee...");
		
		try {
			
			FileOutputStream fis=new FileOutputStream("src/emp.txt");
			
			ObjectOutputStream osr=new ObjectOutputStream(fis);
			
			osr.writeObject(emp);
			
			System.out.println("-- Writing is completed --");
			
			
			
		} catch (Exception e) {
			System.out.println("failed due to "+e);
		}
		
		
		
	}

}
