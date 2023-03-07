package POMPacksouceDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage2 

{

	
	private WebDriver driver;
//	Actions act;
	
	
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/button")
	private WebElement ATC2;
	public void ClickedOnTshirt()
	{
		ATC2.click();
	}
	
//	@FindBy(xpath="(//button[text()='Add to cart'])[5]")
//	private WebElement ATC3;
//	public void ClickedOnTshirtRed()
//	{
//		ATC3.click();
//	}
	
	@FindBy(xpath=("//a[@class='shopping_cart_link']"))
	private WebElement Cart;
	public void ClickOnCart()
	{
		Cart.click();
//		act.click(Cart).perform();
	}
	
	@FindBy(xpath=("//button[text()='Remove']"))
	private List<WebElement> Remove;
	public void RemoveCart()
	{
		for(int i=0;i<Remove.size();i++)
		{
			Remove.get(i).click();
		}
	}
	
	@FindBy(xpath=("//button[@id='continue-shopping']"))
	private WebElement ContinueShop;
	public void ClickOnContinueShop()
	{
		ContinueShop.click();
		driver.navigate().back();
		System.out.println("Navigate to Back");
	}
	
	@FindBy(xpath=("//button[@id='checkout']"))
	private WebElement CheckOut;
	public void ClickOnCheckOut()
	{
		CheckOut.click();
	}
	
	public CartPage2 (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
//		act = new Actions(driver);
	}
}
