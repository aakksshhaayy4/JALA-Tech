//8. Write a program to find Armstrong number or not

package com.akshay.progs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int number = 379;
		int temp;
		int remainder;
		int result=0;
		
		temp = number;
		
		while(temp>0) {
			remainder = temp%10;
			result = result+(remainder*remainder*remainder);
			temp = temp/10;
		}
		if(result == number) {
			System.out.println(number+" is Armstrong Number");
		}
		else {
			System.out.println(number+" is not Armstrong Number");
		}

		
	}

}
