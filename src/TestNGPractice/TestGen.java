package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POMClass.POM1;

public class TestGen extends TestBaceClass
{
	private WebDriver driver;
	
	@Test
	public void Method1()
	{
		
		POM1 pm = new POM1(driver);
		
		pm.clickedOnATC();
		
		//button[@id='add-to-cart-sauce-labs-backpack']
		System.out.println("Method 1");
	}
}
