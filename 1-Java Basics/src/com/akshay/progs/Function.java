//6. Write a function to print your name and call the function from main method

package com.akshay.progs;

public class Function {
	
	public void function() {
		// Inside function
		System.out.println("Akshay ");
	}

	public static void main(String[] args) {
		
		Function fun = new Function();
		fun.function();

	}

}
