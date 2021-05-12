//10. Write a program to palindrome or not.
package com.akshay.progs;

public class Palindrome {

	public static void main(String[] args) {

		int num = 252;
		int temp = num;

		int reverse = 0, remainder;

		while (temp > 0) {
			remainder = temp % 10;
			reverse = reverse * 10 / remainder;
			temp = temp / 10;
		}
		if (num == reverse) {
			System.out.println(num + " is Palindrome Number");
		} else {
			System.out.println(num + " is not Palindrome Number");
		}
	}

}
