//17. Write a method to verify if the array contains two specified elements(12,23)

package com.akshay.progs;

import java.util.HashSet;
import java.util.Set;

public class VerifyNumbers {
	/*
	 * public static Set<Integer> available(int val1, int val2, int arr[]){
	 * Set<Integer> values = new HashSet<Integer>();
	 * 
	 * for(int i = 0; i<arr.length;i++) { if(arr[i]==val1 ) { values.add(arr[i]);
	 * values.contains(values); } if(arr[i]==val2) { values.add(arr[i]);
	 * values.contains(values); } }
	 * System.out.println("Available : "+values.contains(values)); return values; }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * int array[] = {52,96,45,23,46,74,12};
	 * 
	 * Set<Integer> values = available(23,14, array);
	 * 
	 * System.out.println(values);
	 * 
	 * }
	 * 
	 * }
	 */
	public static void main(String[] args) {

		int array[] = { 52, 96, 45, 23, 46, 74, 12 };

		int num = 23;
		int num2 = 12;
		for (int i : array) {
			if (i == num) {
				System.out.println(num + " Found in Array");
				break;
			}
		}
		for (int j : array) {
			if (j == num2) {
				System.out.println(num2 + " Found in Array");
				break;
			}

		}
	}
}
