//1. Write a function to add integer values of an array

package com.akshay.progs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingValues {

	public static void main(String[] args) {

		List array = new ArrayList();

		array.add(0, 50);
		array.add(1, 10);

		System.out.println("Array Containing : " + array.toString() + " values");
		System.out.println("Size of the Current Array is : " + array.size());

	}

}
