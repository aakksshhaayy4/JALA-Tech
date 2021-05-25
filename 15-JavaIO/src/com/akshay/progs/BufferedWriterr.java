package com.akshay.progs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterr {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("BufferedWriter.txt"));

		bw.write(120);
		bw.write("akshya");
		bw.write('v');
		bw.write('b');

		bw.flush();

	}

}
