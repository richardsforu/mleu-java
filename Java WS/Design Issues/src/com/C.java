package com;

public class C implements I2, I1 {

	public static void main(String[] args) {
		I1 i1 = new C();
		i1.f1();

		I2 i2 = new C();
		i2.f1();
	}

	@Override
	public void f1() {

		System.out.println("Hello f1 " + this.getClass().getInterfaces());

		System.out.println("-------------");

	}

}
