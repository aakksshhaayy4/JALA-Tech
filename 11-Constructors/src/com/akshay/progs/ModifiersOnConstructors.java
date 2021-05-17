//3. Apply private, public, protected and default access modifiers to the constructor

package com.akshay.progs;

public class ModifiersOnConstructors {

	// public constructor
	public ModifiersOnConstructors() {
		System.out.println("Default public constructor");
	}

	// protected constructor
	protected ModifiersOnConstructors(int m) {
		System.out.println("protected parameterised constructor");
	}

	// private constructor
	private ModifiersOnConstructors(String sn, int a) {
		System.out.println("private parameterised constructor");
	}

}
