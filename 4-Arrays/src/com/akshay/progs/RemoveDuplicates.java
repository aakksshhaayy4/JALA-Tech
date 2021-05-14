//12. Write a method to remove duplicate elements from an array

package com.akshay.progs;

import java.util.Arrays;

public class RemoveDuplicates {
	public static Integer[] removeDuplicates(int[] array) {
		Integer tempArr[] = new Integer[array.length];

		int n = 0;

		for (int i = 0; i < array.length; i++) {
			Integer currentElement = array[i];

			if (currentElement != array[i + 1]) {
				tempArr[n++] = currentElement;
				break;
			}
		}
		tempArr[n++] = array[array.length - 1];
		return tempArr;
	}

	public static void main(String[] args) {

		int array[] = { 1, 3, 2, 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("Original Array : " + Arrays.toString(array));

		Integer tempArr[] = removeDuplicates(array);

		System.out.println(Arrays.toString(tempArr));

	}

}
