package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import ObjectRepository.GoogleHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTestCase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.in");

		GoogleHomePage obj = new GoogleHomePage(driver);

		obj.EnterText().sendKeys("aksjnjknda",Keys.ARROW_DOWN,Keys.ENTER);

	Actions act = new Actions(driver);
	
	
//		act.keyDown(Keys.ENTER).build().perform();
obj.ClickSearch();
	}

}
