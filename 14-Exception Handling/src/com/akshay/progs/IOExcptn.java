//12. Write a program to generate IOException

package com.akshay.progs;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOExcptn {

	public static void main(String[] args) throws IOException {

		try {
			FileOutputStream file = new FileOutputStream("abc.text");
		} catch (IOException ioe) {
			System.out.println("File not found");
			throw new IOException(ioe.toString());
		}

	}

}
