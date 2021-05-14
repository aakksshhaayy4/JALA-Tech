//5. Call static methods in instance methods

package com.akshay.progs;

public class CallStaticMethodInInstanceMethod {

	public static void m1() {
		System.out.println("Static Method Calling");
	}

	public void m2() {
		System.out.println("Calling Static Method From Instance Method");
		m1(); // calling static method
	}

}
