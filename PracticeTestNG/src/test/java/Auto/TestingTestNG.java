package Auto;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestingTestNG {
	
	
	@Test
	public static void test1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.in");
		driver.findElement(By.name("q")).sendKeys("Rahul",Keys.ENTER);
		driver.quit();
	}
	
	@Test
	public static void test2()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions obj=new ChromeOptions();
		obj.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(obj);
		
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.in");
		driver.findElement(By.name("email")).sendKeys("Rahulsahani285@gmail.com",Keys.ENTER);
		driver.quit();
	}

	public static void main(String[] args) {
	
		

	}

}
