package com.akshay.progs;

public class IInterfaceImpl2 implements IInterface2 {

	public static void main(String[] args) {
		IInterfaceImpl2 inter = new IInterfaceImpl2();
		inter.m2();
//		inter.m1();

	}

	@Override
	public String m2() {
		System.out.println("Implemented method");
		return null;
	}

}
