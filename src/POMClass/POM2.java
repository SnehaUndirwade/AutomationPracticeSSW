package POMClass;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 
{
	WebDriver driver;
	
	@FindBy(xpath="(//body//div//div//div//form//input)[1]")
	private WebElement username;
	public void SendUsername() 
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="(//body//div//div//div//form//input)[2]")
	private WebElement password;
	public void SendPass()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="(//body//div//div//div//form//input)[3]")
	private WebElement LogIn;
	public void LogIn()
	{
		LogIn.click();
	}
		
	
	
//	@FindBy(xpath="//a[@class='shopping_cart_link']")
//	private WebElement ATCbutton;
//	public String ConfirmATC()
//	{
//		String TotalProduct = ATCbutton.getText();
//		return TotalProduct;
//	}
//	
//	@FindBy(xpath="//button[text()='Add to cart']")
//	private List<WebElement> AllATCart;
//	public void clickAllATCart()
//	{
//		for(int i=0; i<AllATCart.size(); i++)
//		{
//			AllATCart.get(i).click();
//		}
//
//	}
//	
//	@FindBy(xpath="//button[text()='Open Menu']")
//	private WebElement MenuButton;
//	public void ClickedMenuButton()
//	{
//		MenuButton.click();
//	}
//	
//	@FindBy(xpath="//a[@id='logout_sidebar_link']")
//	private WebElement LogOutButton;
//	public void ClickedLogOutButton()
//	{
//		LogOutButton.click();
//	}
//	
	
	
	public POM2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	}
