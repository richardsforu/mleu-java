package com;

import java.io.FileInputStream;
import java.util.Properties;

public class FIleNotFoundDemo {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("src/test.properties");
			Properties props = new Properties();
			props.load(fis);

			String empName = props.getProperty("name123");
			if(empName==null) {
				throw new NullPointerException();
			}
			System.out.println("Name: " + empName);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("--- Statement 1");
	}

}
