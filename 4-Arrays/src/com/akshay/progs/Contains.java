//4. Write a function to test if array contains a specific value

package com.akshay.progs;

public class Contains {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6 };

//		we can directly check, the value is present in the array or not
//		System.out.println(array.toString().contains("2"));

		int find = 8;

		boolean found = false;

		for (int n : array) {
			if (n == find) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(find + "  is found in Array");
		} else {
			System.out.println(find + " is not found in this array");
		}

	}

}
