package com;

import java.io.File;
import java.io.FileInputStream;

public class BytesReadDemo {

	public static void main(String[] args) {
		
		
		try {
			
			File f=new File("src/abc.txt");
			
					
			FileInputStream fis=new FileInputStream(f);
			
			for(int i=0;i<f.length();i++) {
				int data=fis.read();
				System.out.print((char)data);
			}
			
		} catch (Exception e) {
			System.out.println("failed due to "+e);
		}
	}

}
