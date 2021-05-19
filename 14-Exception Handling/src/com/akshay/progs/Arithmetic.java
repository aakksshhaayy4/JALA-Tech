//8. Write a program to generate Arithmetic Exception

package com.akshay.progs;

public class Arithmetic {

	public static void main(String[] args) {

		int n;
		int v;

		try {
			n = 54;
			v = n / 0;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException("should be divide by zero");
		}

	}

}
