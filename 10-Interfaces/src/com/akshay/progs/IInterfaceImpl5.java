package com.akshay.progs;

public class IInterfaceImpl5 implements IInterface5_1, IInterface5_2 {

	@Override
	public void method() {
		System.out.println("Implemented Method");
	}

	public static void main(String[] args) {

		IInterfaceImpl5 inter = new IInterfaceImpl5();

		inter.method();

	}

}
