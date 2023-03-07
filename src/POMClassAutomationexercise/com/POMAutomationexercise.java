package POMClassAutomationexercise.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMAutomationexercise 
{
	
	private WebDriver driver;
	
	
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/form/input[2]")
	private WebElement UserName;
	public void SendUserName()
	{
		UserName.sendKeys("kyswapnil@rediffmail.com");
	}
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement PassWord;
	public void SendPassWord()
	{
		PassWord.sendKeys("Ssw@123");
	}
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement LogIn;
	public void ClickLoginBtton()
	{
		LogIn.click();
	}
	
	
	
	public POMAutomationexercise(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
