package com;

public class Test {

	public static void main(String[] args) {

		try {
			int x = 100;
			int y = x / 0;
			System.out.println("Y= " + y);

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		} finally {
			System.out.println("-- Always executes");
		}

		System.out.println("--- statement1");
		System.out.println("--- ststement2");

	}

}
