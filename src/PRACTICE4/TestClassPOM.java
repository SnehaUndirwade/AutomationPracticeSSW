package PRACTICE4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassPOM 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Open the Browser");
		
		driver.manage().window().maximize();
		System.out.println("maximize the browser");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Open the URL");
		
		POMclass LoginPage = new POMclass(driver);
		
		LoginPage.sendUsername();
		System.out.println("Username is Entered");
		
		LoginPage.sendPassword();
		System.out.println("PassWord is Entered");
		
		LoginPage.clickLogIn();
		System.out.println("Clicked on LogIn Button");
		
		

		
	}
}
