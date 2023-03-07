package POMtestClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMClass.POM1;

public class TextClass1 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C://Users//S//Desktop//new//chromedriver_win32//Chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is Open");
	
	driver.manage().window().maximize();
	System.out.println("Browser is Maximize");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("URL is Open");
	
	POM1 LP = new POM1(driver);
	
	LP.sendUserName();
	System.out.println("User Name is Entered");
	
	LP.sendPassWord();
	System.out.println("Password is Entered");
	
	LP.clickLogIn();
	System.out.println("Login page is clicked");
	
//	Alert alt = driver.switchTo().alert();
//	alt.accept();
	
	LP.clickAllATC();
	System.out.println("All 6 product is added to cart");
	
	String ExpectedCount = "6";
	String actualCout = LP.ATCbuttonGetText();
	
	if(ExpectedCount.equals(actualCout))
	{
		System.out.println("Text case is Pass");
	}
	else
	{
		System.out.println("Text case is Failed");
	}
		
	LP.clickedOnMenu();
	System.out.println("Clicked on menu button");
	
//	LP.LogOutButton();
//	System.out.println("Log Out");
	
//	driver.quit();
//	System.out.println("broswer is closed");

	
	
}





}
