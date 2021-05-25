//6. Write a program to write text to .txt file using FileWriter

package com.akshay.progs;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterr {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("FileWriter.txt");

		fw.write('a');
		fw.write("akshY");
		fw.write(75);
		fw.write('x');

		fw.flush();

	}

}
