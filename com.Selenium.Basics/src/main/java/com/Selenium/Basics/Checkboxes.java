package com.Selenium.Basics;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/checkbox");
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button' and @title='Toggle' ]")));
	
	List<WebElement> lst=driver.findElements(By.xpath("//button[@type='button' and @title='Toggle' ]"));
	for(int i=0;i<lst.size();i++) {
	lst.get(i).click();
	Thread.sleep(2000);
	}
	
	

	}

}
