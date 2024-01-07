package com.Selenium.Basics;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaunchBrowser {
	static WebDriver driver;
	static String TitlePreLogin = "Your store. Login";
	static String TitlePostLogin = "Dashboard / nopCommerce administration";
	static String Email_id = "admin@yourstore.com";
	static String password = "admin";
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul
		// Nishad\\OneDrive\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");

		driver = driverInit(driver);

		TitleValidationPreLogin(driver, TitlePreLogin);
		login(driver);
		TitleValidationPostLogin(driver, TitlePostLogin);
		Logout(driver);
		TearDown(driver);

	}

	public static WebDriver driverInit(WebDriver driver) {
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com");
		driver.manage().window().maximize();

		return driver;
	}

	public static void login(WebDriver driver) {
		WebElement EmailIdTextbox = driver.findElement(By.xpath("//input[@class='email']"));
		EmailIdTextbox.clear();
		EmailIdTextbox.sendKeys(Email_id);

		WebElement PasswordTextBox = driver.findElement(By.id("Password"));
		PasswordTextBox.clear();
		PasswordTextBox.sendKeys(password);

		driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

	}

	public static void TitleValidationPostLogin(WebDriver driver, String Title) {
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals(Title)) {
			System.out.println("PostLogin Title Validation passed");
		} 
		else if (!driver.getTitle().equals(Title)) {
			System.out.println("Postlogin Title Validation Failed");
		}
	}

	public static void TitleValidationPreLogin(WebDriver driver, String Title) {
		// Validation 1:- Verify the page title

		if (driver.getTitle().equals(Title)) {
			System.out.println("Prelogin Title Validation passed");
		} else if (!driver.getTitle().equals(Title)) {
			System.out.println("PreLogin Title Validation Failed");
		}
	}
	
	public static void Logout(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	public static void TearDown(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

	

}
