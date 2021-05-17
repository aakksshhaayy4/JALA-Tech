package com.akshay.progs;

public class TestUsingSuper extends UsingSuper {

	public TestUsingSuper() {
		System.out.println(super.a);
		System.out.println(super.s);
		super.m1();
	}

	public static void main(String[] args) {

		TestUsingSuper tus = new TestUsingSuper();
		

	}

}
