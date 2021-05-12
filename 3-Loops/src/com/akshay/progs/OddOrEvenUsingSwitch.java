// 11. Program to check whether a number is EVEN or ODD using switch

package com.akshay.progs;

public class OddOrEvenUsingSwitch {

	public static void main(String[] args) {

		int num = 401;
		
		switch (num%2) {
		case 0: {
			System.out.println(num+" is Even Number");
			break;
		}
		case 1:
			System.out.println(num+" is Odd Number");
			break;
		}
	}

}
