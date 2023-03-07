package POMPacksouceDemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage2POM 



{
	private WebDriver driver;
	private Select s;
		
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement bagButton;
	
	public void clickBagButton()
	{
		bagButton.click();
	}
	
	//addToCartButton
	@FindBy(xpath="//div[@id='shopping_cart_container']")
	private WebElement addToCartButton;
	
	public String getTextFromAddToCart()
	{
		String totalProducts= addToCartButton.getText();
		return totalProducts;
	}
	
	

	
	
	//dropdown
	@FindBy(xpath="//form//div[2]//input")
	private WebElement dropDown;
	
	public void clickOnDropDown()
	{
		dropDown.click();
		s.selectByVisibleText("Text");
	}
	
	
	
	//allProduct Elements
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> allProducts;		
	public void clickAllProducts()
	{
		allProducts.get(0).click();
		allProducts.get(1).click();
		allProducts.get(2).click();
//		allProducts.get(3).click();
//		allProducts.get(4).click();
//		allProducts.get(5).click();
		
		//or
		
//		for(int i=0; i<allProducts.size();i++)
//		{
//			allProducts.get(i).click();
//		}
		
		//assignment--forloop-singlw products
		//List-collection concept
		//for no suitable
		//for each loop--> use 
		//youtube/google
	}
	
	
	
	
	
	
	
	
	
	//constrctor
	public void HomePage2POM(WebDriver driver)
	{
         this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		s = new Select(dropDown);
	}

}
