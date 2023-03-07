package POMTextSauceDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPacksouceDemo.HomePagePOM;
import POMPacksouceDemo.LoginPOM;

public class TC01TestVerifyHomePage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is Open");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Site is Open");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximize");
		
		LoginPOM LN = new LoginPOM(driver);
		
		LN.EnterLoginId();
		System.out.println("LogIn ID is Entered");
		
		LN.EnterPassword();
		System.out.println("PassWord is Entered");
		
		LN.LogInButton();
		System.out.println("Clicked on LogIn Button");
		
		
		HomePagePOM HP = new HomePagePOM(driver);
		
		HP.menubutton();
		System.out.println("Clicked on Menu Button");
		
		HP.AboutButton();
		System.out.println("Clicked on about Button");
		
		HP.ClickonCloseMenuButton();
		System.out.println("Close Menu");
		
		
		
		HP.ATCButton();
		System.out.println("Add to Cart");
		
		driver.quit();
		System.out.println("Browser is closed");
		
		
	}
}
