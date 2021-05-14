//7. Call static methods and instance methods in main method

package com.akshay.progs;

public class CallStaticAndInstanceMethod {
	
	//Static Method
	public static void m2() {
		System.out.println("Static Method");
	}
	
	//Instance Method
	public void m1() {
		System.out.println("Instance Method");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");

		//calling static method
		m2();
		
		CallStaticAndInstanceMethod call = new CallStaticAndInstanceMethod();
		
		//calling Instance method
		call.m1();
		

	}

}
