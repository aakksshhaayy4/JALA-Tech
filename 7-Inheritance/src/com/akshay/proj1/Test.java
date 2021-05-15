package com.akshay.proj1;

public class Test {

	public static void main(String[] args) {

		System.out.println("-----Inside Main Method");
		A a = new A();
		B b = new B();
		C c = new C();

		System.out.println();

		System.out.println("-----Calling A class methods");
		a.m1();
		a.m2();
		a.common();

		System.out.println();

		System.out.println("-----Calling B class methods");
		b.m3();
		b.m4();
		b.common();

		System.out.println();

		System.out.println("-----Calling C class methods");
		c.m5();
		c.m6();
		c.common();

		// super class reference and subclass object
		A a1 = new B();
		A a2 = new C();

		System.out.println();

		System.out.println("-----Calling overridden method using superclass reference");
		a1.common();
		a2.common();

	}

}
