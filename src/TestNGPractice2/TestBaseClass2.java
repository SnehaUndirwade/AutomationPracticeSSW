package TestNGPractice2;



import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMClass.POM1;
import POMClassAutomationexercise.com.POMAutomationexercise;
import POMPacksouceDemo.LogOutFuncinality;
import POMPacksouceDemo.LoginPOM;

public class TestBaseClass2 
{
	
	 WebDriver driver;
	
	@BeforeClass
	public void setUp() throws IOException
	{
		System.setProperty("webdriver.gecko.driver","C://Users//S//Desktop//new//GeckoDriverWin64//Geckodriver.exe");
		
		driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver","C://Users//S//Desktop//new//chromedriver_win32//Chromedriver.exe");
//		
//		driver = new ChromeDriver();
		System.out.println("Browser is Open");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("WebSite is Open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximze");
		
		
	}
	
	@BeforeMethod
	public void LogInFunctionality()
	{
		LoginPOM LG = new LoginPOM(driver);
		
		LG.EnterLoginId();
		System.out.println("LogIn ID Entered");
		
		LG.EnterPassword();
		System.out.println("PassWord is Entered");
		
		LG.LogInButton();
		System.out.println("Clicked on LogIn Button");
	}
	
	@Test
	public void Method1()
	{
		
		POM1 pm = new POM1(driver);
		
		pm.clickedOnATC();
		
		//button[@id='add-to-cart-sauce-labs-backpack']
		System.out.println("Method 1");
	}
	
	
	
	
	@AfterMethod
	public void LogOutFunctionality()
	{
		LogOutFuncinality LO = new LogOutFuncinality(driver);
		
		LO.MenuButton();
		System.out.println("Clicked on Menu Button");
		
		LO.LogOutButton();
		System.out.println("Clicked on 'Log Out' Button");
	
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}
}
