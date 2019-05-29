package com;

import java.io.FileOutputStream;

public class ByteWritingV1 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("src/abc.txt");
			
			String message = "Good Afternoon 123";

		
			for(int i=0;i<message.length();i++) {
				int data=message.charAt(i);
				//System.out.print((char)data);
				fos.write(data);
			}
			
			
			fos.close();
			System.out.println("--- Writing is done");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
