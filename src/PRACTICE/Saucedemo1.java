package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	 // System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement UserId = driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
		
		UserId.sendKeys("standard_user");
		Thread.sleep(2000);
		
		WebElement Pass = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
		
		Pass.sendKeys("secret_sauce");  
		Thread.sleep(2000);
		
		WebElement LogIn = driver.findElement(By.xpath("//input[contains(@id,'login-button')]"));
		//LogIn.clear();
		//LogIn.click();  
		//Thread.sleep(2000);
		String Attribute = LogIn.getAttribute("id");
		System.out.println("Atribute is ="+Attribute);
		
		String HTMLtext = LogIn.getText();
		System.out.println("HTML Textis ="+HTMLtext);
		
		String TagName = LogIn.getTagName();
		System.out.println("Tag Name is ="+TagName);
		
		
		//WebElement addTOcart = driver.findElement(By.xpath("html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/button"));
		
		//addTOcart.click(); 
		//Thread.sleep(2000);
		
		//WebElement InTocart = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
		
		//InTocart.click();//button[@id='checkout']
		//Thread.sleep(2000);
		
		//WebElement ContAdToCart = driver.findElement(By.xpath("//button[@id='checkout']"));
		
		//ContAdToCart.click();//input[@id='first-name']
		//Thread.sleep(2000);
		
		//WebElement EnterName = driver.findElement(By.xpath("//input[@id='first-name']"));
		
		//EnterName.sendKeys("swapnil");//input[@id='last-name']
		//Thread.sleep(2000);
		
		//WebElement EnterLastName = driver.findElement(By.xpath("//input[@id='last-name']"));
		
		//EnterLastName.sendKeys("walde");//input[@id='postal-code']
		//Thread.sleep(2000);
		
		//WebElement EnrPostCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		
		//EnrPostCode.sendKeys("441803");
		//Thread.sleep(2000);
		
		//WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		
		//Continue.click();//button[text()='Finish']
		//Thread.sleep(2000);
		
		//WebElement Finish = driver.findElement(By.xpath("//button[text()='Finish']"));
		
		//Finish.click();
	
		
		
				
				
		
	}
}
