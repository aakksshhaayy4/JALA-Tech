//4. Write two methods with the same name and same number of parameters of different 
//type and call from main method

package com.akshay.progs;

public class Overloading4 {

	public void method(int a, double d) {
		System.out.println("int, double");
	}

	public void method(String s, float b) {
		System.out.println("String, float");
	}

	public static void main(String[] args) {

		Overloading4 ovr = new Overloading4();
		ovr.method(8, 45.8);
		ovr.method("akshay", 6.7f);

	}

}
