package com;

public class ClassLoadDemo {

	public static void main(String[] args) throws Exception {

		try {
			Class.forName("com.Test12");
			System.out.println("Class loaded...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
