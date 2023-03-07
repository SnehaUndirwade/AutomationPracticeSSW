package Annotation;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMClass.POM1;
import POMClass.POM2;
import POMClass.POM21;
import POMPacksouceDemo.BuyPage;
import POMPacksouceDemo.CartPage2;
import POMPacksouceDemo.HomePagePOM;


public class TestAnno 
{
	WebDriver driver;
	
	@BeforeTest
	public void BeforeMethod()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\chromedriver_win32\\Chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("browser is open");
		
		driver.manage().window().maximize();
		System.out.println("browser maximize");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Web Page is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		POM2 LP = new POM2(driver);
		
		LP.SendUsername();
		System.out.println("Pasword is sended");
		
		LP.SendPass();
		System.out.println("Pasword is sended");
		
		LP.LogIn();
		System.out.println("Log In button is clicked");
	}
	
	@Test
	public void TestMethod()
	{
        POM21 HP = new POM21(driver);
		
		HP.clickAllATC();
		System.out.println("All Product select in Add to Cart");
		
         HP.ATCGetText();
         System.out.println("Get text from current WebSite");
         
         String AcceptedATC = "6";
         String ActualATC = HP.ATCGetText();
         
         if (AcceptedATC.equals(ActualATC))
         {
        	System.out.println("text case is Pass"); 
         }
         else
         {
        	 System.out.println("Test Case is Fail");
         }
   	}
	
	 @AfterMethod
     public void LogOut()
     {
    	 HomePagePOM LG = new HomePagePOM(driver);
    	 
    	 LG.menubutton();
    	 
    	 LG.LogOutButton();
    	 System.out.println("Account iS Log out");
//    	 driver.quit();
    	 
     }
	 
	 @AfterClass
	 public void ChromeQuit()
	 {
		 driver.quit();
	 }
	

}
