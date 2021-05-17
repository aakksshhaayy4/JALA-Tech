//1. Write a class with a default constructor, one argument constructor and two argument 
//constructors. Instantiate the class to call all the constructors of that class from a main 
//class
package com.akshay.progs;

public class Constructors {

	// Default Constructor
	public Constructors() {
		System.out.println("default constructor");
	}

	// 1-Param Constrcutor
	public Constructors(int m) {
		System.out.println("1-param Constructor");
	}

	// 2-pARAM constructor
	public Constructors(int m, int n) {
		System.out.println("2-param COnstructor");
	}

	public static void main(String[] args) {

		Constructors c = new Constructors();
		Constructors c1 = new Constructors(0);
		Constructors c2 = new Constructors(0, 1);
	}

}
