package com.Selenium.Basics;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	 

		driver.get("https://nextdoor.com/");

		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']/div"));
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5000));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']/div")));
		
		Wait<WebDriver> flu=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(3))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);
		
		flu.until(new Function<WebDriver,WebElement>(){
		public WebElement apply(WebDriver t)
		{
			return driver.findElement(By.xpath("//input[starts-with(@class,'blocks') and @aria-label='Email address']"));
		}
		});
		
		
		//FluentWait
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)) 
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver t) {
				return driver
						.findElement(By.xpath("//input[starts-with(@class,'blocks') and @aria-label='Email address']"));
			}
		
		}	
		);
		
		
		
		
		WebElement Password = driver
				.findElement(By.xpath("//input[starts-with(@class,'blocks') and @aria-label='Password']"));

		Password.click();
		LoginButton.click();

	}

}
