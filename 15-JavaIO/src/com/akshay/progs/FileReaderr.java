//5. Write a program to read text from .txt file using FileReader

package com.akshay.progs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderr {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("FileReader.txt");

		int i;

		while ((i = fr.read()) != -1) {
			System.out.print(i + "----");
			System.out.println((char) i);
		}

	}

}
