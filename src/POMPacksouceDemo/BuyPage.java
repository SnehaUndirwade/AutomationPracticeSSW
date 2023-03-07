package POMPacksouceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPage 
{
	private WebDriver driver;
	
	@FindBy(xpath=("//button[@id='checkout']"))
	private WebElement CheckOut1;
	public void ClickOnCheckOut1()
	{
		CheckOut1.click();
	}
	
	@FindBy(xpath=("//input[@id='first-name']"))
	private WebElement FirsName;
	public void EneterFirstName()
	{
		FirsName.sendKeys("Swapnil");
	}
	
	@FindBy(xpath=("//input[@id='last-name']"))
	private WebElement LastName;
	public void EneterLastName()
	{
		LastName.sendKeys("Walde");
	}
	
	@FindBy(xpath=("//input[@id='postal-code']"))
	private WebElement PostalCode;
	public void EneterPostalCode()
	{
		PostalCode.sendKeys("441803");
	}
	
	@FindBy(xpath=("//input[@id='continue']"))
	private WebElement Continue1;
	public void ClickedOnContinue1()
	{
		Continue1.click();
	}
	
	@FindBy(xpath=("//button[@id='finish']"))
	private WebElement Finish;
	public void ClickedOnFinish()
	{
		Finish.click();
	}
	
	@FindBy(xpath=("//button[@id='back-to-products']"))
	private WebElement HomeButton;
	public void ClickedOnHomeButton()
	{
		HomeButton.click();
	}
	
	public BuyPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
}
