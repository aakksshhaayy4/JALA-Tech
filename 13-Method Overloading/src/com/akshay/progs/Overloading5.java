//5. Write two methods with the same name, number of parameters and data type but 
//different return Type

package com.akshay.progs;

public class Overloading5 {

	public void method(int a, int b) {
		System.out.println("int, double");
	}

	public int method(int a, int b) {
		System.out.println("String, float");
		return 0;
	}

	public static void main(String[] args) {

		Overloading5 ovr = new Overloading5();
		ovr.method(4, 5);

	}

}

//we cannot write same method with same parameter, type and list, 
//else it gives compile time error : duplicate method
//return type doesn't matter in overloading
