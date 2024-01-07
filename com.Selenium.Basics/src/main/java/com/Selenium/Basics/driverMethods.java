package com.Selenium.Basics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverMethods {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();

		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(2000));
		driver.navigate().refresh();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.youtube.com");

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com");

		List<String> handles = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(handles.get(0));
		Thread.sleep(2000);
		driver.switchTo().window(handles.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(handles.get(2));
		Thread.sleep(2000);
		System.out.println(handles.size());

		Set<Cookie> ss = driver.manage().getCookies();
		for (Cookie c : ss)
			System.out.println(c);

		Set<String> s = new HashSet<String>();
		s.add("Rahul");
		s.add("Rahul");
		s.add("Rahul");
		s.add("Ankit");
		s.add("Rahul");

		for (String names : s)
			System.out.println(names);

	}
}
