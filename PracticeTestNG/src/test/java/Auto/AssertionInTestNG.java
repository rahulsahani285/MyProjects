package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionInTestNG {
	@Test
	public static void test1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.in");
		driver.findElement(By.name("q")).sendKeys("Rahul",Keys.ENTER);
		String PageTitle=driver.getTitle();
		
		//Title Assertion
		Assert.assertEquals(PageTitle,"Rahul - Google Searchh" , "Assertion 1 Failed the title matching" );
		
		System.out.println("After hard Assertion code");
		
		
	}
	
	@Test
	public static void test2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.in");
		driver.findElement(By.name("q")).sendKeys("Rahul",Keys.ENTER);
		String PageTitle=driver.getTitle();
		SoftAssert obj=new SoftAssert();
		obj.assertEquals(PageTitle,"Rahul - Google Searchh" , "Assertion 1 Failed the title matching" );
		System.out.println("After soft Assertion code");
		
		obj.assertAll();
		
		
	}

}
