//2. Write a program to write text to .txt file using OutputStream

package com.akshay.progs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputtStream {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("OutputStream.txt");
		
		fos.write('b');
		fos.write(99);
		fos.write(101);
		fos.write('z');
		
		fos.flush();
		
		
	}

}
