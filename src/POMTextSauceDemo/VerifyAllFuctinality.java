package POMTextSauceDemo;

import java.time.Duration;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPacksouceDemo.BuyPage;
import POMPacksouceDemo.CartPage2;
import POMPacksouceDemo.HomePagePOM;
import POMPacksouceDemo.LoginPOM;



public class VerifyAllFuctinality 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		LoginPOM LN = new LoginPOM(driver);
		LN.EnterLoginId();
		System.out.println("Username is Entered");
		
		LN.EnterPassword();
		System.out.println("Password is Entered");
		
		Thread.sleep(2000);
		
		LN.LogInButton();
		System.out.println("Clicked on Login Button");
		
//		LN.ClickedOnBag();
		
		Thread.sleep(2000);
		
//		HomePagePOM HP = new HomePagePOM(driver);
//		
//		HP.ATCButton();
//		System.out.println("Clicked on Addto Cart Button");
//		
//		Thread.sleep(2000);
//		
//		HP.ClickFilterDropDown();
//		System.out.println("Click on Filter Button");
		
//		Thread.sleep(2000);
//		
//		
//		CartPage2 CP = new CartPage2(driver);
//		
//		CP.ClickOnCart();
//		System.out.println("Clicked on Cart Button");
//		
//		Thread.sleep(1000);
//		
//		CP.ClickOnCheckOut();
//		System.out.println("Clicked on CheckOut Buttton");
		
		
		
//		BuyPage BP = new BuyPage(driver);
//		
//		BP.EneterFirstName();
//		System.out.println("First Name Entered");
//		
//		BP.EneterLastName();
//		System.out.println("Last Name Entered");
//		
//		BP.EneterPostalCode();
//		System.out.println("Potal Copde Entered");
//		
//		Thread.sleep(2000);
//		
//		BP.ClickedOnContinue1();
//		
//		BP.ClickedOnFinish();
//		System.out.println("Clicked on Finish Button");
//		
//		Thread.sleep(2000);
//		
//		BP.ClickedOnHomeButton();
//		System.out.println("Clicked on Home Button");
//		
//		Thread.sleep(2000);
//		
//		HP.ATCButton();
//		System.out.println("Again clicked on Add to Cart");
//		
//		CP.ClickOnCart();
//		System.out.println("Again clicked on Cart button");
//		
//		Thread.sleep(2000);
//		
//		CP.RemoveCart();
//		System.out.println("clicked on remove button");
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Program SuccessFul End");
		
		
		
		
		
	
}}

	
