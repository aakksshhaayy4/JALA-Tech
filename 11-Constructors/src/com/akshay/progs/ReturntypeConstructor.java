//4. Write constructors with return type int and String

package com.akshay.progs;

public class ReturntypeConstructor {

	// void return type-default constructor
	public ReturntypeConstructor() {
		System.out.println("default constructor-void return type");
	}

	// int return type
	public int ReturntypeConstructor(int a) {
		System.out.println("int return type constructor");
		return a;
	}

	// string return type
	public String ReturntypeConstructor(String s) {
		System.out.println("string return type constructor");
		return s;
	}
}
