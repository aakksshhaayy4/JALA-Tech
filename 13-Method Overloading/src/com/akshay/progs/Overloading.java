//1. Write two methods with the same name but different number of parameters of same type 
//and call the methods from main method

package com.akshay.progs;

public class Overloading {

	public void method(int a) {
		System.out.println("int");
	}

	public void method(int a, int b) {
		System.out.println("int, int");
	}

	public static void main(String[] args) {

		Overloading ovr = new Overloading();
		ovr.method(4);
		ovr.method(0, 65);

	}

}
