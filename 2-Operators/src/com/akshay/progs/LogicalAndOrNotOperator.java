//5. Programs on Logical AND,OR operator and Logical NOT

package com.akshay.progs;

public class LogicalAndOrNotOperator {

	public static void main(String[] args) {

		Boolean a = true;
		Boolean b = false;

		System.out.println("(a && b) : " + (a && b));

		System.out.println("(a || b) : " + (a || b));

		System.out.println("(!a && b) : " + (!a && b));

		System.out.println("(a && !b) : " + (a && !b));

		System.out.println("(!a && !b) : " + (!a && !b));

	}

}
