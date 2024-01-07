package com.Selenium.Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritedatafromProperty {

	public static void readFromProperty(String s, Properties prop) throws IOException {
		File file = new File(
				"C:\\Users\\Rahul Nishad\\eclipse-workspace\\com.Selenium.Basics\\src\\main\\java\\com\\Selenium\\Basics\\data.properties");
		FileInputStream fl = new FileInputStream(file);
		prop.load(fl);

		System.out.println(prop.getProperty("name"));
	}

	public static void WriteToProperty(String s, Properties prop) throws IOException {
		File file = new File(
				"C:\\Users\\Rahul Nishad\\eclipse-workspace\\com.Selenium.Basics\\src\\main\\java\\com\\Selenium\\Basics\\data.properties");
		FileOutputStream fl = new FileOutputStream(file, false);
		prop.setProperty("Name", "Rahul Sahani");

		prop.store(fl, "Writing data in property file");

		fl.close();
		// fl.flush();

	}

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		readFromProperty(
				"C:\\Users\\Rahul Nishad\\eclipse-workspace\\com.Selenium.Basics\\src\\main\\java\\com\\Selenium\\Basics\\data.properties",
				prop);
		WriteToProperty(
				"C:\\Users\\Rahul Nishad\\eclipse-workspace\\com.Selenium.Basics\\src\\main\\java\\com\\Selenium\\Basics\\data.properties",
				prop);

	}

}
