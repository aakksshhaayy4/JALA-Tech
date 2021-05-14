//11. Write a program to find the common values between two arrays

package com.akshay.progs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonValues {

	public static Set<Integer> findCommonValues(int arr1[], int arr2[]) {

		Set<Integer> commonVal = new HashSet<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[i] == arr2[j]) {
					commonVal.add(arr1[i]);
				}
			}
		}
		return commonVal;
	}

	public static void main(String[] args) {

		int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		int array2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 17, 18, 13, 15 };

		Set<Integer> commonVal = findCommonValues(array1, array2);

		System.out.println("First Array : " + Arrays.toString(array1));
		System.out.println("Second Array : " + Arrays.toString(array2));

		System.out.println("Common values in both arrays : " + commonVal);

	}

}
