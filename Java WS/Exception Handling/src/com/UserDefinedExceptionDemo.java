package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Properties;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileInputStream fis = new FileInputStream("src/test.properties");
		Properties props = new Properties();
		props.load(fis);
		String filedName = "name";

		String empName = props.getProperty(filedName);

		if (empName == null) {
			throw new InvalidFiledException(filedName + " is Invalid Filed ");
		}
		System.out.println("Name: " + empName);

		System.out.println("--- Statement 1");
	}

}
