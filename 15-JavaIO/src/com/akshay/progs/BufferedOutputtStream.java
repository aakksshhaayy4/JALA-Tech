//4. Write text to a .txt file using BufferedOutputStream

package com.akshay.progs;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputtStream {

	public static void main(String[] args) throws IOException {

		FileOutputStream fis = new FileOutputStream("BufferedOutputStream.txt");

		BufferedOutputStream bos = new BufferedOutputStream(fis);

		bos.write(555);
		bos.write('s');
		bos.write('b');
		bos.write(745);

		bos.flush();
	}

}
