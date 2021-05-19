//2. Handle the Arithmetic exception using try-catch block

package com.akshay.progs;

public class HandleUsingTry_Catch {

	public static void main(String[] args) {

		int a;
		int div;
		try {
			a = 10;
			div = a / 0;
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}

	}

}
