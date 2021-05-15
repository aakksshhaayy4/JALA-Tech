//Also, Access the PROTECTED fields and methods from child class located in a different 
		//package

package com.akshay.pack2;

import com.akshay.pack1.ProtectedAM;

public class ChildProtectedAM extends ProtectedAM {

	public static void main(String[] args) {
		
		ChildProtectedAM prm = new ChildProtectedAM();

		// calling protected fields
		System.out.println(prm.x);
		System.out.println(prm.name);

		// calling protected method
		prm.m1();

	}

}
