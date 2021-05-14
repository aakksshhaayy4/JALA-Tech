//16. Write a function to get the difference of largest and smallest value

package com.akshay.progs;

public class DiffBetnLargestSmallest {

	public static void main(String[] args) {

		int array[] = { 56, 51, 53, 52, 87, 59, 81, 89 };
		int max = array[0];
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}

		}
		System.out.println("Difference between Largest Value : " + max + " and Smallest Value : " + min + " value is : "
				+ (max - min));
	}

}
