package POMClass;

import java.util.List;
import java.util.function.Consumer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PRACTICE.WebElements;

public class POM21 
{
	WebDriver driver;
	
	@FindBy(xpath=("//a[@class='shopping_cart_link']"))
	private WebElement GetTextATC;
	public String ATCGetText()
	{
		String TotalCount = GetTextATC.getText();
		return TotalCount;
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement>AllATC;
	public void clickAllATC()
	{
//		for (int i=0;i<AllATC.size();i++)
//		{
//			AllATC.get(i).click();
//		}
//		for(int i=0;i<AllATC.size();i++)
//		{
//			AllATC.get(i).click();
//		}
		( AllATC.get(0)).click();
		( AllATC.get(1)).click();
		
	}
	
	

	public POM21(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	}
	

