package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailWeb 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ifkv=ARgdvAueufEmgiMV8MwXtWEwMG3utcILhZOwqyY6DPmj0UkhnppQWuB4mu3NCX5xpQ5cc1JdcH_A&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().window().maximize();
		
		WebElement UserId = driver.findElement(By.name("identifier"));
		
		UserId.sendKeys("swapnilswalde@gmail.com");
		
		WebElement nextButton = driver.findElement(By.className("VfPpkd-J1Ukfc-LhBDec"));
		
		nextButton.click();
		
	
	}
}
