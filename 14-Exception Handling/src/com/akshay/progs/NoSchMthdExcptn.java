//14. Write a program to generate NoSuchMethodException

package com.akshay.progs;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class NoSchMthdExcptn {

	public static void main(String[] args) {

		Set set = new HashSet();

		Hashtable table = new Hashtable();

		set.iterator().next(); // NoSuchMethodException..

		table.elements().nextElement(); // Here also NoSuchMethodException occess, becauyse nextElement() searches
										// elements in hash table but it does not found and then it throws exception

	}

}
