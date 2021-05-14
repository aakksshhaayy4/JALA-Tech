//13. Write a method to find the second largest number in an array

package com.akshay.progs;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int array[] = { 5, 22, 55, 65, 23, 12, 95, 85, 32, 53, 21 };

		int firstVal = Integer.MIN_VALUE;
		int secondVal = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > firstVal) {
				secondVal = firstVal;
				firstVal = array[i];
			} else if (array[i] > secondVal) {
				secondVal = array[i];
			}
		}

		System.out.println("First Largest : " + firstVal + " and Second Largest : " + secondVal);
	}

}
