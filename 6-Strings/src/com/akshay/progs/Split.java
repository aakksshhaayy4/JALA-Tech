//11. Splitting strings with split()

package com.akshay.progs;

public class Split {

	public static void main(String[] args) {

		String s = "Hello coders, My Name is Akshay and I am Java Developer";

		System.out.println("Original String : " + s);

		System.out.println();

		System.out.println("-----String After Split()");
		String[] split = s.split(" ");
		for (String s1 : split) {
			System.out.println(s1);
		}

		System.out.println();

		System.out.println("-------String after Split(-,-) method");
		String[] split2 = s.split(" ", 5);
		for (String s2 : split2) {
			System.out.println(s2);
		}
	}

}
