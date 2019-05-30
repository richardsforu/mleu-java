package com;

import java.io.File;
import java.io.FileReader;

public class FileReadertDemo {
	
	public static void main(String[] args) {
		
		try {
			
			File f=new File("src/xyz.txt");
			FileReader fr=new FileReader(f);
			
			for(int i=0;i<f.length();i++) {
				System.out.print((char)fr.read());
			}
			
			fr.close();
			
			System.out.println("--- Done ---");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
