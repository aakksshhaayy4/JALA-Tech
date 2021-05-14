//15. Write a method to find number of even number and odd numbers in an array

package com.akshay.progs;

import java.util.Arrays;

public class FindOddEven {

	public static void main(String[] args) {
		int array[] = { 56, 51, 25, 53, 52, 87, 59, 81, 89, 90 };
		System.out.println("Array : " + Arrays.toString(array));

		System.out.print("Even's : ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Odd's : ");
		for (int j = 0; j < array.length; j++) {
			if (array[j] % 2 == 1) {
				System.out.print(array[j] + " ");
			}
		}

	}

}
