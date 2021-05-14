//7. Write a function to insert an element at a specific position in the array

package com.akshay.progs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertElement {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(4);
		list.add(9);
		list.add(1);
		list.add(2);

		System.out.println("Current Array : " + list);
		// Adding element at specific position
		list.add(2, 8);

		System.out.println("New array After inseting Value : " + list);

	}

}
