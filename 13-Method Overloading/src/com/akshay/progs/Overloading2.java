//2. Write two methods with the same name but different number of parameters of different 
//data type and call the methods from main method

package com.akshay.progs;

public class Overloading2 {

	public void method(int a) {
		System.out.println("int");
	}

	public void method(String s, float b) {
		System.out.println("String, float");
	}

	public static void main(String[] args) {

		Overloading2 ovr = new Overloading2();
		ovr.method(8);
		ovr.method("akshay", 6.7f);

	}

}
