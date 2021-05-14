//6. Print all the static, instance variables in main method

package com.akshay.progs;

public class PrintStaticInstanceVariable {
	
	//static variable
	static int p = 41;
	static String name = "Akshay";
	
	//Instance variable
	int x = 52;
	String surname="Akhare";

	public static void main(String[] args) {
		
		System.out.println("Printing Static Variables");
		System.out.println(p);
		System.out.println(name);
	
		System.out.println();
		
		PrintStaticInstanceVariable var = new PrintStaticInstanceVariable();
		System.out.println("Printing Non-Static Variables");
		System.out.println(var.x);
		System.out.println(var.surname);

	}

}
