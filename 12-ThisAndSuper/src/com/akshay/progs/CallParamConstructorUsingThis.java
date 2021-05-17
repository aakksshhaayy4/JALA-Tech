//4. Call argument constructor of current class using this()

package com.akshay.progs;

public class CallParamConstructorUsingThis {

	public CallParamConstructorUsingThis() {
		this(1);
		System.out.println("Default");
	}

	public CallParamConstructorUsingThis(int n) {
		System.out.println("1-param");
	}

	public static void main(String[] args) {

		CallParamConstructorUsingThis cut = new CallParamConstructorUsingThis();

	}

}
