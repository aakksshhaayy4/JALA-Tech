//5. Write a program to print largest number among three numbers.

package com.akshay.progs;

public class LargestNumber {

	public static void main(String[] args) {

		int a = 50;
		int b = 40;
		int c = 30;

		if (a < b && c < b) {
			System.out.println("b is larger number");
		} else if (b < c && a < c) {
			System.out.println("c is larger number");
		} else if (c < a && b < a) {
			System.out.println("a is larger number");
		}

	}

}
