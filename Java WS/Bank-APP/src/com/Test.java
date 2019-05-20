package com;

public class Test {

	public static void main(String[] args) {

		Customer c = new Bank();
		c.withDraw();
		c.deposit();

		BankEmployee be = new Bank();
		be.openAccount();
		be.closeAccount();
		
		
		Cleark co=new Bank();
		co.clearkOperations();

	}

}
