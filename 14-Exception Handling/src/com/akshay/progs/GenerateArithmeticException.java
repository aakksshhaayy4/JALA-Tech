//Write a program to generate Arithmetic Exception without exception handling

package com.akshay.progs;

public class GenerateArithmeticException {

	public static void main(String[] args) {

		int a = 10;
		int div = a / 0;

		System.out.println(div); // here Arithmetic exception occurs.. because we cannot devide any value by
									// zero.. else it throws Arithmetic exception

	}

}
