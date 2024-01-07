package com.Selenium.Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("headless");

		WebDriver driver = new ChromeDriver(chrome);
		driver.get("https://admin-demo.nopcommerce.com");

		List<String> links = new ArrayList<String>();

		LaunchBrowser.login(driver); // Called this to login

		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for (WebElement e : elements) {
			links.add(e.getAttribute("href"));
			VerifyUrls(e.getAttribute("href"));
		}

	}

	public static void VerifyUrls(String Urls) throws IOException {
		HttpURLConnection obj = (HttpURLConnection) new URL(Urls).openConnection();

		obj.connect();
		System.out.println(obj.getResponseCode());

	}

}
