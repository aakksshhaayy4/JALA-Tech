package com.akshay.customexception;

public class TestCustomException {

	static void validateAge(int age) throws InvalidaAgeException {
		if(age>18) {
			System.out.println("You are Eligible for voting");
		}
		else {
			throw new InvalidaAgeException("You are not Valid For Voting");
		}
	}

	public static void main(String[] args) {

		try {
			validateAge(16);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done....");
		
		
	}

}
