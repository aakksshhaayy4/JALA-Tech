//2. Write a function to calculate the average value of an array of integers

package com.akshay.progs;

public class AverageValueOfArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		float average;
		int sum, loop;

		sum = (int) (average = 0);
		for (loop = 0; loop < 10; loop++) {
			sum = sum + a[loop];
		}

		average = sum / loop;
		System.out.println("The average of Array is : " + average);
	}

}
