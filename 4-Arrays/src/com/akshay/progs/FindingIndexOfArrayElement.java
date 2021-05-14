//3. Write a program to find the index of an array element

package com.akshay.progs;

public class FindingIndexOfArrayElement {

	public static int findIndex(int[] a, int target) {

		int len = a.length;
		int i = 0;

		while (i < len) {
			if (a[i] == target) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return 1;

	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		System.out.println(" position is : " + findIndex(array, 4));
	}

}
