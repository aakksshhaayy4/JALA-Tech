//1. Write a program to read text from .txt file using InputStream

package com.akshay.progs;

import java.io.FileInputStream;
import java.io.IOException;

public class InputtStream {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("InputStream.txt");
		
		int i ;
		
		while((i= fis.read()) != -1) {
			System.out.print(i+" .....");
			System.out.println((char)i);
		}
		
		
		
	}

}
