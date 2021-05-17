//2. Create an interface with two methods, but implement only one in a class. Call the 
//method implemented.
package com.akshay.progs;

public interface IInterface2 {

	default void m1() {
		System.out.println("Default method");
	}

	public String m2();

}
