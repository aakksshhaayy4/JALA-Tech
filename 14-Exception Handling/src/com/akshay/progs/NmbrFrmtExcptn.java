//16. Write a program to generate NumberFormatException

package com.akshay.progs;

public class NmbrFrmtExcptn {

	public static void main(String[] args) {

		int a = Integer.parseInt("aKSHAY");
		int b1 = Integer.parseInt(" ");

		System.out.println(a); // Number format exception.. we're passsing wrong value..
		System.out.println(b1);

	}

}
