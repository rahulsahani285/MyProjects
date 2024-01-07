package Auto;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.jline.terminal.spi.TerminalProvider.Stream;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataProviderPractice {
	static WebDriver driver;

	@Test(priority = 0, dataProvider = "ReadDataFromExcel", dataProviderClass = DataSupplier.class, timeOut = 10000, expectedExceptions = {
			NoSuchElementException.class, ThreadTimeoutException.class })
	public static void login(String username, String Password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[starts-with(@class,'oxd-button')]")).click();
		System.out.println("Completed 1 cycle");

		teardown();
	}

	@Test()
	public static void teardown() {
		driver.close();
	}

}
