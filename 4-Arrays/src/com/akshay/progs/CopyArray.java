//6. Write a function to copy an array to another array

package com.akshay.progs;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.print("Original Array : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

		System.out.println();

		int[] array2 = new int[array.length];
		array2 = Arrays.copyOf(array, array.length);
		System.out.print("Copied Array : ");
		for (int j = 0; j < array2.length; ++j) {
			System.out.print(" " + array2[j]);
		}

	}

}
