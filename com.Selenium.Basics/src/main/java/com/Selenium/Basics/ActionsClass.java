package com.Selenium.Basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		WebElement movetoElement=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		act.moveToElement(movetoElement).contextClick().build().perform();
		
		Thread.sleep(5000);
		WebElement SearchBox=driver.findElement(By.id("twotabsearchtextbox"));
		act.moveToElement(SearchBox).click().keyDown(Keys.SHIFT).sendKeys("rahul").build().perform();
		
		SearchBox.click();
Action Copytext=act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
Copytext.perform();
SearchBox.click();
SearchBox.click();
act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();


	}

}
