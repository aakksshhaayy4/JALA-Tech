//13. Program for multiple if else statement(Largest number in 10,20 and 30)

package com.akshay.progs;

public class MultipleIf_Else {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int z = 30;

		if (x < y && z < y) {
			System.out.println(y + " is Largest Number");
		} else if (y < z && x < z) {
			System.out.println(z + " is Largest Number");
		} else if (z < x && y < x) {
			System.out.println(x + " is Largest Number");
		}
	}

}
