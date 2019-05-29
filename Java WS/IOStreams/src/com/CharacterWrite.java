package com;

import java.io.FileWriter;

public class CharacterWrite {
	
	public static void main(String[] args) {
		try {
			
			FileWriter fw=new FileWriter("src/xyz.txt");
			String msg="Welcome to Kolkata";
			fw.write(msg);
			fw.close();
			System.out.println("--- Writing is dione ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
