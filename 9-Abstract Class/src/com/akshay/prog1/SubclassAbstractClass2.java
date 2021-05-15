//3. Create an instance for the child class in child class and call abstract methods

package com.akshay.prog1;

public class SubclassAbstractClass2 extends AbstractClass {

	public static void main(String[] args) {

		SubclassAbstractClass2 clss = new SubclassAbstractClass2();

		// calling override method.. which is overriden in superclass as abstract method
		clss.m1();

	}

	@Override
	void m1() {
		System.out.println("Subclass's override m1 method");

	}

}
