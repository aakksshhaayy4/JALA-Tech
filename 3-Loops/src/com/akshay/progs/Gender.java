//12. Print gender (Male/Female) program according to given M/F using switch

package com.akshay.progs;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		char gender = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter 'M/F' ");
		gender = scn.next().charAt(0);

		switch (gender) {
		case 'M': {
			System.out.println("Male");
			break;
		}
		case 'F': {
			System.out.println("Female");
			break;
		}
		}
	}
}
