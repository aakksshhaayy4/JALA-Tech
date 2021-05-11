//5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables

package com.akshay.progs;

public class Variables {

	int a = 10; // global variable

	public static void main(String[] args) {

		int a = 20; // local variable

		System.out.println(a); // prints local variable's value..

		// If we want to call gloabal variable, need to create object and then we can
		// access it

 		Variables v = new Variables();
		System.out.println(v.a); // it prints global variable
	}

}
