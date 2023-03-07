package POMPacksouceDemo;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOM 
{
	private WebDriver driver;
//	private Select s;
//	private Actions act;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> ATC;
	public void ATCButton()
	{
		
			ATC.get(0).click();
//			ATC.get(1).click();
//			ATC.get(2).click();
//			ATC.get(3).click();
//		
	}
	
	@FindBy(xpath=("//button[text()='Open Menu']"))
	private WebElement Menu;
	public void menubutton()
	{
		
		
//		act.click(Menu).perform();
		Menu.click();
		
	}
	
	@FindBy(xpath=("//a[text()='About']"))
	private WebElement About;
	public void AboutButton()
	{
		About.click();
//		act.click(About).perform();
		
	}
	
	@FindBy(xpath=("//button[text()='Close Menu']"))
	private WebElement CloseMenu;
	public void ClickonCloseMenuButton()
	{
		CloseMenu.click();
//		act.click(CloseMenu).perform();
	}
	
//	@FindBy(xpath=("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select"))
//	private WebElement FilterDropDown;
//	public void ClickFilterDropDown()
//	{
//		FilterDropDown.click();
//		s.selectByVisibleText("Price (low to high)");
//	}
	
	@FindBy(xpath=("//span[@class='shopping_cart_badge']"))
	private WebElement GetText;
	public String GetText()
	{
		String TotalATC = GetText.getText();
		return TotalATC;
	}
	
//	@FindBy(xpath=("//button[@id='react-burger-menu-btn']"))
//	private WebElement Menu;
//	public void MenuButton()
//	{
//		Menu.click();
//	}
	
	@FindBy(xpath=("//a[@id='logout_sidebar_link']"))
	private WebElement LogOut;
	public void LogOutButton()
	{
		LogOut.click();
	}
	
	
	
	
	public HomePagePOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
//		s = new Select(FilterDropDown);
//		act = new Actions(driver);
	}
	
}
