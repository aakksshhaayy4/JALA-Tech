/*1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to 
ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList
*/
package com.akshay.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Initial size of Array is : " + list.size());

		System.out.println();

		// adding elements to arraylist
		list.add("akshay");
		list.add("pavan");
		list.add("soham");
		list.add("harish");
		list.add("shruti");
		list.add("shradha");
		list.add("Atharva");
		list.add("pooja");
		list.add("swati");
		list.add("shrishant");
		System.out.println("After adding 10 elements in ArrayList : " + list);

		// Iterating through the ArrayList by using Iterator object
		Iterator<String> iterate = list.iterator();

		System.out.println();

		// displaying the values after iterating the list
		System.out.println("The iterator values of list are : ");
		while (iterate.hasNext()) {
			System.out.println(iterate.next() + " ");
		}

		System.out.println();

		// Adding an element at a specific index
		list.add(1, "codewithakshay");
		list.add(4, "jivan");
		System.out.println("After Adding the element at specific index : " + list);

		System.out.println();

		// Removing an element from the ArrayList, Remove at an index
		list.remove(8);
		System.out.println("After removing element from array : " + list);

		System.out.println();

		// Updating the element at a specific index
		list.set(1, "komal");
		System.out.println("Array After updating the element at specific index : " + list);

		System.out.println();

		// Check the element is present at a particular index
		System.out.println("---------------------------CHECKING THE ELEMENTS");
		String element = "codewithakshay";
		if (list.contains(element)) {
			System.out.println(element + " is present in the array");
		} else {
			System.out.println(element + " is not present in the array");
		}

		System.out.println();

		// Get an element at a particular index
		System.out.println("getting the elements at specific index : " + list.get(5));

		System.out.println();

		// Find out the size of the ArrayList
		System.out.println("The size of the ArrayList is : " + list.size());

		System.out.println();

		// Check the given element is present in the ArrayList
		String isPresent = "amar";
		if (list.contains(isPresent)) {
			System.out.println(isPresent + " is present in ArrayList");
		} else {
			System.out.println(isPresent + " is not present in ArrayList");
		}

		// Remove all elements of the ArrayList
		boolean removeAll = list.removeAll(list);
		System.out.println(" Items removed : " + removeAll);
		System.out.println("Size of the arrayList is : "+list.size());

	}
}
