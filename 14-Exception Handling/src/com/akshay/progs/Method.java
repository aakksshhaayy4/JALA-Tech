//3. Write a method which throws exception, Call that method in main class without try block

package com.akshay.progs;

public class Method {

	public void m1() throws Exception {
		System.out.println("Method which is throwing Exception");
	}

	public static void main(String[] args) throws Exception {

		Method meth = new Method();
		meth.m1();

	}

}

//if you're not adding try-catch block.. we must throw exception to main method 