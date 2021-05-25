//7. Read text from a .txt file using BufferedReader

package com.akshay.progs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderr {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("BufferedReader.txt"));

		int i;

		while ((i = br.read()) != -1) {
			System.out.print(i + "----");
			System.out.println((char) i);
			
		}

	}

}
