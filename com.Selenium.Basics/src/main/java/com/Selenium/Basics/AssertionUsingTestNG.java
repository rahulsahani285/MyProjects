package com.Selenium.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionUsingTestNG {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://nextdoor.com/");
Assert.assertEquals("Nextdoor", driver.getTitle());
System.out.println("After Assert");

if(driver.getTitle().contains("Nextdoor"))
{
	Assert.assertTrue(true);
}
else
{
	Assert.assertTrue(false);
}
	}

}
