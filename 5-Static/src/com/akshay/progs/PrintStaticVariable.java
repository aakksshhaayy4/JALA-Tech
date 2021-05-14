//3. Print static variables in Instance methods

package com.akshay.progs;

public class PrintStaticVariable {

	static int c = 50;
	static String name = "Akshay";

	public void m1() {
		// Printing static variabels from instance method
		System.out.println(c);
		System.out.println(name);
	}

}
