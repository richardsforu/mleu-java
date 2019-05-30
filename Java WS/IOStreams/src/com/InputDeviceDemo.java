package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputDeviceDemo {

	public static void main(String[] args) {

		try {

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Ennter City: ");
			String city = br.readLine();
			System.out.println("City Name: " + city);

			System.out.println("Input a Number: ");
			int no = Integer.parseInt(br.readLine());

			System.out.println("Number is " + no);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
