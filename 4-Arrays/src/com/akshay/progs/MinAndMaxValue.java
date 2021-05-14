//8. Write a function to find the minimum and maximum value of an array

package com.akshay.progs;

public class MinAndMaxValue {

	int min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int array[] = { 54, 85, 24, 98, 34 };

		MinAndMaxValue minMax = new MinAndMaxValue();

		System.out.println("Maximum value in the Array : " + minMax.max(array));
		System.out.println("Minimum value in the Array : " + minMax.min(array));

	}

}
