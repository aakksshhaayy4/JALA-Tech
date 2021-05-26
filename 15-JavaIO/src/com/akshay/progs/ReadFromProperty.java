//9. Write a program to read data from properties file.

package com.akshay.progs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperty {

	public static void main(String[] args) throws IOException {

		try {
			FileReader reader = new FileReader("PropFile.properties");
			Properties prop = new Properties();
			prop.load(reader);
			String url = prop.getProperty("db.url");
			String username = prop.getProperty("db.username");
			String driver = prop.getProperty("db.driver");
			String password = prop.getProperty("db.password");
			System.out.println("DRIVER : " + driver);
			System.out.println("URL : " + url);
			System.out.println("USERNAME : " + username);
			System.out.println("PASSWORD : " + password);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
