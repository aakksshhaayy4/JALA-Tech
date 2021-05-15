//7. Comparing strings using the methods equals(), 

package com.akshay.progs;

public class EqualsMethod {

	public static void main(String[] args) {
		
		String s1 = "Akshay";
		String s2 = "akshay";
		String s3= "Akhare";
		String s4 = "akhare";
		String s5= "Akshay";
		String s6 = "Akhare";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s5));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s6));

	}

}
