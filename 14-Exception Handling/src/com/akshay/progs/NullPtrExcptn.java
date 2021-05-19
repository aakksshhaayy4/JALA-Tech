//15. Write a program to generate NullPointerException

package com.akshay.progs;

public class NullPtrExcptn {

	public static void main(String[] args) {

		String s[] = null;

		System.out.println(s.length); // NullPointerException. because, here we are trying to calculate the lenght of
										// the null array

		System.out.println(s[1]); // NullPointerException. because, here we are trying to access first index's
									// value

	}

}
