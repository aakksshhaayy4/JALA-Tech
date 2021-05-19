//18. Write a program to generate SQLException

package com.akshay.progs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptio {

	public static void main(String[] args) {

		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "hr", "hr");
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

}
//Will throw java.sql.SQLException: No suitable driver found for jdbc:oracle:thin:@localhost:1521:ORCL