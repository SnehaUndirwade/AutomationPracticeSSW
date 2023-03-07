package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rediffmail 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.rediff.com/");
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		Actions act = new Actions(driver);
		username.sendKeys("kyswapnil@rediffmail.com");
		
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		Password.sendKeys("Ssw@1991");
		
		WebElement logIn = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		act.click(logIn).perform();
		//act.moveToElement(logIn).perform();
		
	}
}
