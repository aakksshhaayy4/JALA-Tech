package com.akshay.progs;

public class IInterfaceImpl implements IInterface {

	@Override
	public void m1() {
		System.out.println("Overriding m1 method");
	}

	public static void main(String[] args) {
		IInterfaceImpl inter = new IInterfaceImpl();

		inter.m1();

	}

}
