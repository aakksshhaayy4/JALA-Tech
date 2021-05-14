package com.akshay.progs;

import java.util.Arrays;

public class MissingElements {
	public static void findMissings(int arr[], int n) {
		/*
		 * int missed = 0; for (int i = 0; i < arr.length; i++) { int index = i + 1; if
		 * (arr[i] != index) { missed = index; break; } } return missed;
		 */
		int diff = arr[0] - 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] - i != diff) {
				while (diff < arr[i] - i) {
					System.out.println((i + diff) + " ");
					diff++;
				}
			}
		}
	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 6, 9, 11, 65, 54, 15, 67, 25, 100 };
		int n = array.length;

		// Arrays.sort(array);

		findMissings(array, n);

	}

}
