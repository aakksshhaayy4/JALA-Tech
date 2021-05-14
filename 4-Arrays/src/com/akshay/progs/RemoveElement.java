//5. Write a function to remove a specific element from an array

package com.akshay.progs;

public class RemoveElement {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		int remove = 5;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == remove) {
				for (int j = i; j < array.length - 1; j++) {
					array[j] = array[j + 1];
				}
				break;
			}
		}
		System.out.println("Removed element is : " + remove);
		System.out.println("Values available in Array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

	}

}
