package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.facebook.com/");
		
		Driver.manage().window().maximize();
		
		WebElement UserId = Driver.findElement(By.id("email"));
		
		
		
		UserId.sendKeys("kyswapnil@rediffmail.com");
		
		WebElement PassWord = Driver.findElement(By.id("pass"));
		
		
		
		PassWord.sendKeys("Ssw@1991");
		
		
		
		WebElement LogIn = Driver.findElement(By.name("login"));
		
		Thread.sleep(3000);
		
		LogIn.click();
		
		
		
		
	}
}
