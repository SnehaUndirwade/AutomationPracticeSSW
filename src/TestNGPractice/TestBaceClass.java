package TestNGPractice;


import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POMClass.POM1;
import POMPacksouceDemo.LogOutFuncinality;
import POMPacksouceDemo.LoginPOM;


public class TestBaceClass 
{
	 WebDriver driver;
		@Parameters("BrowserName")
		@BeforeClass
//		public void setUp() throws IOException
		public void setUp(String BrowserName) throws IOException
		{
			if(BrowserName.equals("Chrome"))
			{
			System.setProperty("webdriver.chrome.driver","C://Users//S//Desktop//new//chromedriver_win32//Chromedriver.exe");
			
			driver = new ChromeDriver();
			System.out.println("Chrome Browser is Open");
			}
			else
			{
			System.setProperty("webdriver.gecko.driver","C://Users//S//Desktop//new//GeckoDriverWin64//Geckodriver.exe");
			
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser is Open");
			}
			
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
