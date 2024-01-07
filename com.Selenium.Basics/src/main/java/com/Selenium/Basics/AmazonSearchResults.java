package com.Selenium.Basics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearchResults {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("headless");
		WebDriver driver = new ChromeDriver(obj);

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#nav-search-submit-button"));

		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("lend");

		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='s-suggestion-container']/div/span"));

		for (WebElement l : suggestions) {
			
			
			if(l.getText().contains("lend"))
			{
				System.out.println(l.getText());
			}
			else
			{
				System.out.println("lend"+l.getText());
			}
			
		}
		
		HttpURLConnection con1=(HttpURLConnection)new URL("https://www.google.com").openConnection();
		
		
		con1.connect();
		System.out.println(con1.getResponseCode());
	}
}







