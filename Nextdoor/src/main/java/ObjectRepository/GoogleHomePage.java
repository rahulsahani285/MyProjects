package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
	
	WebDriver driver;
	
	public GoogleHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//textarea[@class='gLFyf']") WebElement searchbox;
	
	@FindBy(xpath = "//input[@class='gNO89b']") WebElement button;
	
	public WebElement EnterText()
	{
		return searchbox;
	}
	
	public WebElement ClickSearch()
	{
		return button;
	}
	
	
	


}
