//9. Write a program to generate ArrayIndexOutOfBoundException

package com.akshay.customexception;

public class ArryIndxOtBndExcptn {

	public static void main(String[] args) {

		int array[] = { 4, 5, 6, 8, 2, 7 };

		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i] + " ");
		}

	}

}
