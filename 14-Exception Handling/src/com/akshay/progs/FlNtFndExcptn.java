//11. Write a program to generate FileNotFoundException

package com.akshay.progs;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FlNtFndExcptn {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("abx.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
