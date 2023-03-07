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
import POMPacksouceDemo.HOMEPOM;
import POMPacksouceDemo.HomePage2POM;
import POMPacksouceDemo.HomePagePOM;
import POMPacksouceDemo.LogOutFuncinality;
import POMPacksouceDemo.LoginPOM;

public class TC01VerifyHomePage extends TestBaceClass
{	
	@Test
	public void VerifyHomePage()
	{
		HOMEPOM HP = new HOMEPOM(driver);
		
		HP.AllATC();
		System.out.println("Clicked All Add to Cart");
		
		HP.DropDown();
		System.out.println("Clicked on DropDown");
		
		HP.MenuButton();
		System.out.println("Clicked on Menu button");
		
//		HP.AboutButton();
//		System.out.println("clicked on About Button");
		
		HP.CloseMenuButton();
		System.out.println("Closed Menu Button");
	}
	
}
