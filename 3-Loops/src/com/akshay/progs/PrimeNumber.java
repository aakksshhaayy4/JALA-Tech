//9. Write a program to find the prime or not.

package com.akshay.progs;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 132;
		int flag = 0;
		int m = n/2;
		
		if(n == 0 || n==1) {
			System.out.println(n+" is not Prime Number");
		}
		else {
			for(int i = 2; i<m; i++) {
				if(n%i==0) {
					System.out.println(n+" is not Prime Number");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println(n+" is Prime Number");
			}
		}
	}

}
