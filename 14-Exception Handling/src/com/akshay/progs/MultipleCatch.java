//4. Write a program with multiple catch blocks

package com.akshay.progs;

import java.io.FileNotFoundException;

public class MultipleCatch {

	public static void main(String[] args) {

		int a;
		int b;

		try {
			a = 498;
			b = a / 0;
		} catch (ArrayIndexOutOfBoundsException aiob) {
			aiob.printStackTrace();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
