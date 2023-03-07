package POMPacksouceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutFuncinality
{
	private WebDriver driver;
	
	@FindBy(xpath=("//button[@id='react-burger-menu-btn']"))
	private WebElement Menu1;
	public void MenuButton()
	{
		Menu1.click();
	}
	
	@FindBy(xpath=("//a[@id='logout_sidebar_link']"))
	private WebElement LogOut;
	public void LogOutButton()
	{
		LogOut.click();
		System.out.println("Account is Loged Out");
	}
	


	public LogOutFuncinality(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements( driver , this);
	}
	
}
