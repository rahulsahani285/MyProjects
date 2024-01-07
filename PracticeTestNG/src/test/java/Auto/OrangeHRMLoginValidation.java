package Auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginValidation {

	
	static WebDriver  driver ;
	
	@Parameters("Browser")
	@BeforeTest
	public static void initilizeBrowser(String s)
	{
		switch(s.toLowerCase())
		{
		case "chrome":
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			break;
		}
		case "fireFox":
		{
			WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 break;
		 
		}
		case "edge":
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		}
		default:
		{
			System.out.println("Entered into default block");
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 break;
			
		}
		}
		
		
	}
	
	@AfterTest
	public static void Teardown()
	{
		driver.quit();
	}
	
	@Parameters("url")
	@Test
	public static void LaunchApp(String url) {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	@Test
	public static void EnterLoginDetails() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[starts-with(@class,'oxd-button')]")).click();
	}
	
	@Test
	public void NavigateToMyInfo() {
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}
	
	@Test
	public void VerifyMyInfo() {
		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
		driver.quit();
	}

	
	@Test
	public void VerifyLogin() {
		WebElement element = driver.findElement(By.id("welcome"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
		driver.quit();
	}

	
}
