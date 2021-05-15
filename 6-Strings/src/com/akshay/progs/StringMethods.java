//8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()

package com.akshay.progs;

public class StringMethods {

	public static void main(String[] args) {

		String intro = "Hii My Name is Akshay";
		String s1 = "java";
		String s4 = "python";
		String s5 = "python";

		System.out.println("-----equalsIgnoreCase()------");
		// case sensitive
		System.out.println(s1.equalsIgnoreCase("java")); // true

		// case insensitive
		System.out.println(s1.equalsIgnoreCase("JAVA")); // true

		// comparing two strings
		System.out.println(s4.equalsIgnoreCase(s5)); // true

		System.out.println("------startsWith()-------");

		System.out.println(intro.startsWith("Hi")); // true
		System.out.println(intro.startsWith("Akshay")); // false

		System.out.println("------endsWith()-------");

		System.out.println(intro.endsWith("Akshay")); // true
		System.out.println(intro.endsWith("is")); // false

		System.out.println("------compareTo()-------");

		System.out.println(s4.compareTo(s5)); // 0
		System.out.println(s1.compareTo(s5)); // -6 because "j" is smaller than "p" six times
		System.out.println(s5.compareTo(s1)); // 6 because "p" is larger than "j" six times

	}

}
