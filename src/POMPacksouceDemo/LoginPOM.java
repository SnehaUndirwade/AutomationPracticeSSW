package POMPacksouceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM 
{
	 private WebDriver driver;
	
	@FindBy(xpath=("//input[@id='user-name']"))
	private WebElement LogInId;
	public void EnterLoginId()
	{
		LogInId.sendKeys("standard_user");
	}
	
	@FindBy(xpath=("//input[@id='password']"))
	private WebElement Pass;
	public void EnterPassword()
	{
		Pass.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath=("//input[@id='login-button']"))
	private WebElement LogIn;
	public void LogInButton()
	{
		LogIn.click();
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement ATC;
	public void ClickedOnBag()
	{
		ATC.click();
	}
	
	public LoginPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
}
