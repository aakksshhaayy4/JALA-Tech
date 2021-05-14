//9. Write a function to reverse an array of integer values

package com.akshay.progs;

import java.util.Arrays;

public class Reverse {
	static void reverseArray(int arr[]) {
		
		System.out.println("Before Reversing the Array : "+Arrays.toString(arr));
		int temp;
		
		for(int i=0; i<arr.length/2; i++) {
			temp = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println("After Revering the Array : "+Arrays.toString(arr));
	}
		
	public static void main(String[] args) {
		
		int array[] = { 45,8, 30,54, 85, 24, 98, 34 };
		reverseArray(array);
		
		
		}
	}


