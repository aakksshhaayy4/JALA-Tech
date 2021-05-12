//1. Write a function for arithmetic operators(+,-,*,/)

package com.akshay.progs;

public class ArithmeticOperator {
	
	public void addition(int a, int b) {
		int c = a + b;
		System.out.println("Addition is : "+c);
	}
	
	public void multiplication(int a, int b) {
		int c = a*b;
		System.out.println("Multiplication is : "+c);
	}
	
	public void substraction(int a, int b) {
		int c = a - b;
		System.out.println("Substraction is : "+c);
	}
	
	public void division(int a, int b) {
		float c = a / b;
		System.out.println("Division is : "+c);
	}

}
