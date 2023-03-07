package TestNGPractice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMPacksouceDemo.BuyPage;
import POMPacksouceDemo.CartPage2;
import POMPacksouceDemo.HOMEPOM;
import POMPacksouceDemo.LogOutFuncinality;
import POMPacksouceDemo.LoginPOM;
import POMUtilitySouceDemo.ScreenShot;

public class TC03VerifyBuyPage extends TestBaceClass
{	
	@Test
	public void VerifyPage()
	{
		
		HOMEPOM HP = new HOMEPOM(driver);
		
		HP.AllATC();
		System.out.println("Clicked All Add to Cart");
		
		CartPage2 CP = new CartPage2(driver);
		CP.ClickOnCart();
		System.out.println("Clicked on Cart Page");
		
		BuyPage BP = new BuyPage(driver);
		
		BP.ClickOnCheckOut1();
		System.out.println("Click on CheckOut button");
		
		BP.EneterFirstName();
		System.out.println("First Name 'Swapnil'");
		
		BP.EneterLastName();
		System.out.println("Last Name 'Walde'");
		
		BP.EneterPostalCode();
		System.out.println("Postal code Entered '441803'");
		
		BP.ClickedOnContinue1();
		System.out.println("Clicked on Continue Button");
		
		BP.ClickedOnFinish();
		System.out.println("clicked on Finish button");
	}
	

	
}
