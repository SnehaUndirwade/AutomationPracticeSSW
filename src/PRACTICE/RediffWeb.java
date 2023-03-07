package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffWeb 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		WebElement Rediff = driver.findElement(By.className("mailicon"));
		
		Rediff.click(); 
		
		WebElement UserId = driver.findElement(By.id("login1"));
		
		UserId.sendKeys("kyswapnil");
		
		WebElement PassWord = driver.findElement(By.id("password"));
		
		PassWord.sendKeys("Ssw@02101991");
		
		WebElement SignIn = driver.findElement(By.name("proceed"));
		
		SignIn.click();
		
		WebElement skip = driver.findElement(By.className("skiplink"));
		
		skip.click();
		
	}
}
