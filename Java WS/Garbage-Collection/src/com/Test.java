package com;

class Employee {
	static int count = 1;

	void f1() {
		System.out.println("--- Employee f1 method");
	}

	@Override
	protected void finalize() throws Throwable {

		//System.out.println("--- Employee object is garbage collected " + count++);

	}

}

public class Test {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();

		System.out.println("Total Memory: " + rt.totalMemory());

		for (int i = 1; i <= 9150000; i++) {
			new Employee();
		}

		System.out.println("Free Memory: " + rt.freeMemory());
		System.out.println("Used memory: " + (rt.totalMemory() - rt.freeMemory()));

		// emp1=null;
		// emp2=null;

		// System.gc();

		// emp1.f1();

		System.out.println("--- Done ---");

	}

}
