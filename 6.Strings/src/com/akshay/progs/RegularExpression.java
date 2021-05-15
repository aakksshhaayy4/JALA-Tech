//6. Matching a String Against a Regular Expression With matches()

package com.akshay.progs;

public class RegularExpression {

	public static void main(String[] args) {

		String s = "Hey Coder ! My Name Is Akshay . Welcome to CodeWithAkshay";

		System.out.println("Available ? : " + s.matches(".* Akshay .*"));

		System.out.println("Available ? : " + s.matches("(.*) Welcome (.*)"));

	}

}
