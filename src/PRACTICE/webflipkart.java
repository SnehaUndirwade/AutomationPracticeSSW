package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webflipkart 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();

		WebElement LogIn = driver.findElement(By.className("_1_3w1N"));
		
		LogIn.click();
		
		WebElement UserId = driver.findElement(By.className("_2IX_2- VJZDxU"));
		
		
		UserId.sendKeys("7875727772");
		
		
		
		
	}

	private static Object text(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
