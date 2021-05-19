//17. Write a program to generate StringIndexOutOfBoundsException

package com.akshay.progs;

public class StngIndxOutOfBndExcptn {

	public static void main(String[] args) {

		String intro = "Hey Coders ! Warm Welcoming to CodeWithAkshay";

		System.out.println("Length of the String is : " + intro.length());

		System.out.println(intro.charAt(47)); // StringIndexOutOfBoundsException.. Because, we're trying to access the
												// 47th character from the string.. but the total lengh of the string is
												// 45 and hence, StringIndexOutOfBoundsExecption occuring..

	}

}
