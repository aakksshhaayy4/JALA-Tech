//7. Write a program with finally block

package com.akshay.progs;

public class FinallyBlock {

	public static void main(String[] args) {

		String s = "Akshay";
		try {
			int a = Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			throw new NumberFormatException("Can't convert String into Numberx");
		} finally {
			System.out.println("Finally block Executed");
		}
		System.out.println("End of the code !");
	}

}
