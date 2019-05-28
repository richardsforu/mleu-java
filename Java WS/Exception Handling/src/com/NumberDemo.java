package com;

import java.util.Scanner;

public class NumberDemo {

	public static void main(String[] args) {

		boolean flag = true;
		
		while (flag == true) {

			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Input a number: ");
				int x = sc.nextInt();
				System.out.println("Number is " + x);
				flag=false;

			} catch (Exception e) {
				System.out.println("Input only numbers. try again ");
			}
		} // end of while loop

	}

}
