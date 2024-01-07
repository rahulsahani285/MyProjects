package com.Selenium.Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://nextdoor.com/");

		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']/div"));
		WebElement EmailID = driver
				.findElement(By.xpath("//input[starts-with(@class,'blocks') and @aria-label='Email address']"));
		WebElement Password = driver
				.findElement(By.xpath("//input[starts-with(@class,'blocks') and @aria-label='Password']"));

		Password.click();
		LoginButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		Actions obj = new Actions(driver);

		System.out.println(driver
				.findElement(By.xpath("//p[@class='blocks-jx8arh' and text()='Please enter a valid email address']"))
				.isDisplayed());
		if (!driver.findElement(By.xpath("//p[@class='blocks-jx8arh' and text()='Please enter a valid email address']"))
				.isDisplayed()) {
			LoginButton.click();

		}
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://www.google.in");

		driver.close();

	}

}
