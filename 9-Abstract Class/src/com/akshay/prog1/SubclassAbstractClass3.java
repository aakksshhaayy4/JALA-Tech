//4. Create an instance for the child class in child class and call non-abstract methods
package com.akshay.prog1;

public class SubclassAbstractClass3 extends AbstractClass {

	public static void main(String[] args) {

		SubclassAbstractClass3 clss = new SubclassAbstractClass3();

		//calling non abstract method
		clss.m2();

	}

	@Override
	void m1() {
		System.out.println("Subclass's override m1 method");

	}

}
