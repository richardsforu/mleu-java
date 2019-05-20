package com;

public class Bank implements Customer, BankEmployee, Cleark {

	@Override
	public void deposit() {
		System.out.println("Depositing ");
	}

	@Override
	public void withDraw() {
		System.out.println("-- Windrawing");
	}

	@Override
	public void openAccount() {
		System.out.println("--- Accoujt opening");
	}

	@Override
	public void closeAccount() {
		System.out.println("--- Account closing");
	}

	@Override
	public void clearkOperations() {
		System.out.println("--- CLear Operations");
	}

}
