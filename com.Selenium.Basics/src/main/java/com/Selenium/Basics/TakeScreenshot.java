package com.Selenium.Basics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;
import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	WebElement element= driver.findElement(with(By.tagName("a")).toLeftOf(driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']"))));
	
	File fl=element.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(fl, new File(System.getProperty("user.dir")+""+"//rahul1.png"));
	
	
	}
}