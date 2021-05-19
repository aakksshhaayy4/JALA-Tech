//10. Write a program to generate ClassNotFoundException

package com.akshay.progs;

public class ClssNtFndExcptn {

	public static void main(String[] args) {

		try {
			Class.forName("jdbc:oracle:thin:@localhost:1521:ORCL");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
