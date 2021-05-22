//3. Create a HashSet with at least 10 elements of type String
//Write program covering all the operations of HashSet

package com.akshay.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		// adding elements to HashSet
		hs.add("Java");
		hs.add("dot net");
		hs.add("c programming");
		hs.add("c++");
		hs.add("python");
		hs.add("html");
		hs.add("css");
		hs.add("angular");
		hs.add("iot");
		hs.add("c#");
		System.out.println("Elements Available in HashSet : " + hs);
		System.out.println("Size of the HashSet is : " + hs.size());

		// check the element is present in HashSet or not
		String element = "iot";
		boolean contains = hs.contains(element);
		System.out.println("Is '" + element + "' avaialble in HashSet ? : " + contains);

		System.out.println();

		// check whether hashset is empty or not
		boolean empty = hs.isEmpty();
		System.out.println("Is this HashSet is Empty ? : " + empty);

		System.out.println();

		// create and use iterator() and check and print the elements
		// creating iterator
		Iterator<String> iterator = hs.iterator();
		// displaying the values after iterating
		System.out.println("Elements after iterating the HAstSet : ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println();

		// remove the specific element from HashSet
		boolean remove = hs.remove(element);
		System.out.println("Is '" + element + "' Removed from HashSet ? : " + remove);

		System.out.println();

		// remove common elements from two hashset's using retain
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("c++");
		hs2.add("python");
		hs2.add("html");
		hs2.add("css");
		hs2.add("angular");
		System.out.println("HashSet second : " + hs2);

		System.out.println();

		System.out.println("Before retainAll hs: " + hs);

		System.out.println();
		// creating retain
		hs.retainAll(hs2);
		System.out.println("After retainAll hs : ");
		System.out.println(hs);

		
	}

}
