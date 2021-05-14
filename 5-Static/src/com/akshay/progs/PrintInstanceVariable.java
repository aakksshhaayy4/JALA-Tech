//2. Print instance variables in static methods

package com.akshay.progs;

public class PrintInstanceVariable {

	int a = 90;
	String name = "Akshay";

	public static void main(String[] args) {

		PrintInstanceVariable var = new PrintInstanceVariable();

		// Printing instance variables from static context
		System.out.println(var.a);
		System.out.println(var.name);

	}

}
