package POMPacksouceDemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HOMEPOM 
{
		private WebDriver driver;
	
		
		@FindBy(xpath="//button[text()='Add to cart']")
		private List<WebElement> ATC;
		public void AllATC()
		{
			for(int i=0;i<ATC.size();i++)
			{
				ATC.get(i).click();
			}
			System.out.println("Clicked on All Add To Cart Button");
		}
		
		@FindBy(xpath="//select[@class='product_sort_container']")
		private WebElement dropdown;
		public void DropDown()
		{
			dropdown.click();
			System.out.println("Clicked on DropDown button");
			Select s = new Select(dropdown);
			s.selectByVisibleText("Price (high to low)");
			
		}
		
		@FindBy(xpath="//button[text()='Open Menu']")
		private WebElement menu;
		public void MenuButton()
		{
			menu.click();
			System.out.println("Clicked on menu button");
		}
		
		@FindBy(xpath="//a[@id='about_sidebar_link']")
		private WebElement about;
		public void AboutButton()
		{
			about.click();
		System.out.println("Clicked on About Button");
		
		driver.navigate().back();
		System.out.println("Navigate Back");
		
		}
		
		@FindBy(xpath="//button[text()='Close Menu']")
		private WebElement closemenu;
		public void CloseMenuButton()
		{
			closemenu.click();	
		}
		
		public HOMEPOM(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
}		
