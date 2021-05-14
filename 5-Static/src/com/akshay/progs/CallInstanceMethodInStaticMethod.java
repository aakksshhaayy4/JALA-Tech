//4. Call instance methods in static methods

package com.akshay.progs;

public class CallInstanceMethodInStaticMethod {

	public void instance() {
		System.out.println("Calling Instance Method");
	}

	public static void main(String[] args) {

		CallInstanceMethodInStaticMethod call = new CallInstanceMethodInStaticMethod();
		call.instance();

	}

}
