//10. Write a function to find the duplicate values of an array

package com.akshay.progs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateValues {

	public static Set<Integer> findDuplicates(int arr[]) {
		Set<Integer> duplicates = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					duplicates.add(arr[i]);
					break;
				}
			}
		}
		return duplicates;
	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 1, 2, 3, 4, 5, 3, 4, 6, 6 };

		Set<Integer> duplicates = findDuplicates(array);

		System.out.println("Original Array : " + Arrays.toString(array));

		System.out.println("Duplicates Avialable : " + duplicates);

	}

}
