package com;

import java.io.FileOutputStream;

public class ByteWriting {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("src/abc.txt");
			
			String message = "I am Praveen";

			byte[] data = message.getBytes();

			fos.write(data);
			//fos.close();
			System.out.println("--- Writing is done");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
