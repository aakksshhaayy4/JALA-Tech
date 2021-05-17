package com.akshay.progs;

public class IInterfaceImpl3 implements IInterface3 {

	public void n1() {
		System.out.println("Implemented class");

	}

	public static void main(String[] args) {

		IInterface3 inter = new IInterfaceImpl3();

		inter.n1();
	}

}
