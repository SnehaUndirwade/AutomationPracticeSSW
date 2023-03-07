package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWeb 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		WebElement SignIn = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		SignIn.click();
		
		WebElement UserId = driver.findElement(By.xpath("//input[@id='ap_email']"));
		
		UserId.sendKeys("swapnilswalde@gmail.com");
		
		WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		
		Continue.click();
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		
		Password.sendKeys("0123456789");
		
		WebElement ContinueButton = driver.findElement(By.xpath("//span[@id='auth-signin-button']"));
		
		ContinueButton.click();
		
        WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
        searchBar.click();
        
        WebElement searchBar1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
        searchBar1.click();
		
		
		
		
		
	}
}
