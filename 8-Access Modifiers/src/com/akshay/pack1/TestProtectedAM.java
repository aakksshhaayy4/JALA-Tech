package com.akshay.pack1;

public class TestProtectedAM {

	public static void main(String[] args) {

		ProtectedAM prm = new ProtectedAM();

		// calling protected fields
		System.out.println(prm.x);
		System.out.println(prm.name);

		// calling protected method
		prm.m1();

	}

}
