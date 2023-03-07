package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusweb 
{
	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMI462xxsuy-wIVlgVyCh2r6g1sEAAYASAAEgJTF_D_BwE");
		
		driver.manage().window().maximize();
		
		WebElement From = driver.findElement(By.xpath("//input[@id='src']"));
		
		From.sendKeys("Nagpur");
		WebElement Nag = driver.findElement(By.xpath("//div[@class='error-message-fixed']"));
		Nag.click();
		
		
		//WebElement To = driver.findElement(By.xpath("//input[@id='dest']"));		
		//To.sendKeys("pune");
		//WebElement SelPune = driver.findElement(By.xpath("//li[@class='selected']"));
		//SelPune.click();
		
		//WebElement Date = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		
		//Date.click();
		
		//WebElement ToDate = driver.findElement(By.xpath("//td[text()='17']"));
		
		//ToDate.click();


		//WebElement Search = driver.findElement(By.xpath("//button[text()='Search Buses']"));
		
		//Search.click();

		
		
		
	}
}
