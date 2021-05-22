/*2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map
*/
package com.akshay.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapOperations {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Insert a Key value mapping into the map
		hm.put(1001, "Akshay");
		hm.put(1002, "Pavan");
		hm.put(1003, "Soham");
		hm.put(1004, "Harish");
		hm.put(1005, "Struti");
		hm.put(1006, "Pooja");
		hm.put(1007, "Shradha");
		hm.put(1008, "Samarth");
		hm.put(1009, "Shweta");
		hm.put(1010, "Adi");

		System.out.println("Students Record Avaialabel in HashMap : " + hm);

		System.out.println();

		// Fetch the value of a Key
		System.out.println("Fetch : " + hm.get(1001));

		// Create a clone/copy of HashMap
		Object clone = hm.clone();
		System.out.println("Clone : " + clone);

		// Check if the given Key is in the Map
		int key = 100;
		boolean isPresent = hm.containsKey(key);
		System.out.println("Is '" + key + "' key Present in the Map ? : " + isPresent);

		// Check if the value is in the Map

		String isAvail = "Akshay";
		boolean containsValue = hm.containsValue(isAvail);
		System.out.println("Is '" + isAvail + "' value Present in the Map ? : " + containsValue);

		// Check if the map is empty
		boolean isempty = hm.isEmpty();
		System.out.println("Is this Map is Empty ? : " + isempty);

		// Print the size of the Map to the console
		int size = hm.size();
		System.out.println("Size of the Map is : " + size);

		// Print all the Keys of the map to the console
		Set<Integer> keySet = hm.keySet();
		System.out.println("Keys : " + keySet);

		// Remove a specific Key-value pair
		int rmvKy = 1010;
		String rmvVl = "Adi";
		boolean remove = hm.remove(rmvKy, rmvVl);
		System.out.println("Is Key-pair ' " + rmvKy + " - " + rmvVl + " ' Removed from Map ? : " + remove);

		// Copy all the elements of the Map to another Map
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		System.out.println("New Map size : " + hm2.size());
		System.out.println("New Map's Value : " + hm2);
		hm2.putAll(hm);
		System.out.println("Size of new Map : " + hm2.size());
		System.out.println("New Map's Value after copying : " + hm2);

	}

}
