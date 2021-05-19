//5. Write a program to throw exception with your own message

package com.akshay.progs;

public class ExceptionWithOwnMsg {

	public static void main(String[] args) {

		int i;
		int b;
		try {
			i = 96;
			b = i / 0;
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception Occured : Don't Divide Numbers By Zero");
		}

	}

}
