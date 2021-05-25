//3. Read text from a .txt file using BufferedInputStream

package com.akshay.progs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputtStream {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("BufferedInputStream.txt");
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int i;
		
		while((i=bis.read()) != -1) {
			System.out.print(i+"....");
			System.out.println((char)i);
			
		}
		
	}

}
