//4. Create a class with PUBLIC fields and methods. 
//Access the public methods and fields from any class in the same package or different 
//package.

package com.akshay.pack1;

public class PublicAM {

	public int a = 50;
	public static String name = "AKHare";

	public void m1() {
		System.out.println("Publix xlass m1 method");
	}

	public static void main(String[] args) {

		PublicAM pum = new PublicAM();

		System.out.println(pum.a);
		System.out.println(name);

		pum.m1();

	}

}
