//1. Create a class with PRIVATE fields, private method and a main method. Print the fields 
//in main method. Call the private method in main method.

package com.akshay.pack1;

public class PrivateAM {

	// private fields
	private static int a = 10;
	private String s = "Akshay";

	private void m1() {
		System.out.println("PrivateAM class m1 method");
	}

	public static void main(String[] args) {

		// main method

		PrivateAM pm = new PrivateAM();

		// calling private fields
		System.out.println(a);
		System.out.println(pm.s);

		// calling private method
		pm.m1();
	}

}
