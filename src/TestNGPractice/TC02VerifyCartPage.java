package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMClass.POM1;
import POMPacksouceDemo.CartPage2;
import POMPacksouceDemo.HOMEPOM;
import POMPacksouceDemo.HomePagePOM;
import POMPacksouceDemo.LogOutFuncinality;
import POMPacksouceDemo.LoginPOM;

public class TC02VerifyCartPage extends TestBaceClass
//extends TestBaceClass
{
			
//	@Test(timeOut=2000,dependsOnMethods= {"VerifyHomePage"})
	@Test
	public void CartPage()
	{
		HOMEPOM HP = new HOMEPOM(driver);
		
		HP.AllATC();
		System.out.println("Clicked All Add to Cart");

		
		CartPage2 CP = new CartPage2(driver);
//		Thread.sleep(5000);
				
		CP.ClickOnCart();
		System.out.println("Clicked on Add to Cart LOGO");
		
		CP.RemoveCart();
		System.out.println("Removed Add to Cart");
		
		CP.ClickOnContinueShop();
		System.out.println("Clicked on continue button");		
	}
	

}
