package com.akshay.progs;

public class IInterfaceImpl8 implements IInterface8 {

	@Override
	public void m1() {
		System.out.println("Override m1 method");

	}

	@Override
	public void m2() {
		System.out.println("Override m2 method");

	}

	public static void main(String[] args) {

		IInterfaceImpl8 inter = new IInterfaceImpl8();

		// calling fields
		System.out.println(inter.v);
		System.out.println(inter.s);

		// calling methods
		inter.m1();
		inter.m2();

	}

}
