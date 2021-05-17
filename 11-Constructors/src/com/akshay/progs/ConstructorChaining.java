//5. Try to call the constructor multiple times with the same object

package com.akshay.progs;

public class ConstructorChaining {

	// default constructor
	public ConstructorChaining() {
		this(1);
		System.out.println("Default construcot");
	}

	// param-constructor
	public ConstructorChaining(int a) {
		this(1, 2);
		System.out.println("1-param constructor");
	}

	// 2-param-constructor
	public ConstructorChaining(int a, int b) {
		this(1, 2, 3);
		System.out.println("2-param constructor");
	}

	// param-constructor
	public ConstructorChaining(int a, int b, int c) {
		this(1, 2, 3, 4);
		System.out.println("3-param constructor");
	}

	// param-constructor
	public ConstructorChaining(int a, int b, int c, int d) {
		System.out.println("4-param constructor");
	}

	public static void main(String[] args) {

		ConstructorChaining c = new ConstructorChaining();

		// here i've created only one object and this object is executing multiple
		// constructor
		// it is the constructor chaining concept

	}

}
