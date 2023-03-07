package PRACTICE4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMclass 
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement Username;
	public void sendUsername()
	{
		Username.sendKeys("standard_user");
	}
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	public void sendPassword()
	{
		Password.sendKeys("secret_sauce");
	}
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement LogIn;
	public void clickLogIn()
	{
		LogIn.click();
	}
	
	public POMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
