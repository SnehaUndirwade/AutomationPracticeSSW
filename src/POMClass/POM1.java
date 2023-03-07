package POMClass;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 
{
	private WebDriver driver;
	private Actions Act;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement UserName;
	public void sendUserName()
	{
		UserName.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement PassWord;
	public void sendPassWord()
	{
		PassWord.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement LogIn;
	public void clickLogIn()
	{
		LogIn.click();
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement>AllATC;
	public void clickAllATC()
	{
//		AllATC.get(0).click();
//		AllATC.get(1).click();
//		AllATC.get(2).click();
//		AllATC.get(3).click();
//		AllATC.get(4).click();
//		AllATC.get(5).click();
		
		for(int i=0;i<AllATC.size();i++)
		{
			AllATC.get(i).click();
		}
//		
		
		
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement ATC;
	public void clickedOnATC()
	{
//		ATC.click();
		Act = new Actions(driver);
		Act.click(ATC).perform();
	}
	
	//button[@id='add-to-cart-sauce-labs-backpack']
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement ATCbuttonText;
	public String ATCbuttonGetText()
	{
		String totalProduct = ATCbuttonText.getText();
		return totalProduct;
	}
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement MenuButton;
	public void clickedOnMenu()
	{
		MenuButton.click();
	}
	
//		@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")
//		private WebElement LogOut;
//		public void LogOutButton()
//		{
//			LogOut.click();
//		}
	
	public POM1 (WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
		
	}
}