//9. Trimming strings with trim()

package com.akshay.progs;

public class Trim {

	public static void main(String[] args) {

		String s = "        Hello there, My Name Is Akshay               ";

		// trim() method eliminates leading and trialing spaces

		System.out.println("Original String Before Trim() : " + s);

		System.out.println("String After Trim() : " + s.trim());

	}

}
