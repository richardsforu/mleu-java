package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		try {

			int x = 10 / 10;
			int[] nos = { 10 };
			nos[87] = 1000;
			File f = new File("d:/abc.txt");
			f.createNewFile();
			Class.forName("com.Somthing");

		} catch (ArithmeticException ae) {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			ae.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException aeb) {
			aeb.printStackTrace();
		} catch (IOException fnf) {
			fnf.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
