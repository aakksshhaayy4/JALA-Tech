//3. Write two methods with the same name and same number of parameters of same type 
//and call from main method

package com.akshay.progs;

public class Overloading3 {

	public void n1(int a, int b) {
		System.out.println("int, int");
	}

	public void n1(int a, int b) {
		System.out.println("int, int");
	}

	public static void main(String[] args) {

		Overloading3 ovr = new Overloading3();
		ovr.n1(4, 5);

	}

}

//we cannot write same method with same parameter, type and list, 
//else it gives compile time error : duplicate method
