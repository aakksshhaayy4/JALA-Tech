//1. Print the fields/instance members of the current class using this and without using object

package com.akshay.progs;

public class PrintUsingThis {

	// instance memebers or fields
	int a = 10;
	String s = "AKSHay";

	{
		System.out.println(this.a);
		System.out.println(this.s);

	}

	public static void main(String[] args) {

		PrintUsingThis v = new PrintUsingThis();

	}

}
