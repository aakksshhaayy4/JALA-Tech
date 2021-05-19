//6. Write a program to create your own exception

package com.akshay.customexception;

public class InvalidaAgeException extends Exception {
	
	public InvalidaAgeException(String s) {
		super(s);
	}

}
