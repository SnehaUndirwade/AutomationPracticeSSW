package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		
	WebDriver Driver = new ChromeDriver();
	
	Driver.get("https://www.saucedemo.com/");
	
	Driver.manage().window().maximize();
	
	WebElement UserName = Driver.findElement(By.id("user-name"));
	
	Thread.sleep(3000);
	
	UserName.sendKeys("standard_user");
	
	WebElement PassWord = Driver.findElement(By.id("password"));
	Thread.sleep(3000);
	
	PassWord.sendKeys("secret_sauce");
	
	Thread.sleep(3000);
	
	WebElement LogIn = Driver.findElement(By.id("login-button"));
	
	Thread.sleep(3000);
	
	LogIn.click();
	
	
	}
}
