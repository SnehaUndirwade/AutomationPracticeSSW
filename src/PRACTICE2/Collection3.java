package PRACTICE2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement LoginButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		LoginButton.click();
		
		WebElement UserName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		UserName.sendKeys("8459429208");
		
		WebElement PassWord = driver.findElement(By.xpath("//input[@type='password']"));
		PassWord.sendKeys("Ssw@123");
		
		WebElement LogIn = driver.findElement(By.xpath("(//button)[3]"));
		LogIn.click();
		
//		WebElement SeaRchBox = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
////		SeaRchBox.click();
//		Thread.sleep(3000);
//		SeaRchBox.sendKeys("Oppo Mobile");
//		Thread.sleep(3000);
//		SeaRchBox.click();
		
		WebElement search = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		search.sendKeys("Oppo Mobile");
//		WebElement SeaRch = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg/g/path[2]"));
//		SeaRch.click();
		
//		WebElement oppomob = driver.findElement(By.xpath("//div[text()='OPPO K10 (Blue Flame, 128 GB)']"));
//		oppomob.click();
		
//		List<WebElement> allATC = driver.findElements(By.xpath("//div[contains(text(),'OPPO F')]"));
////		allATC.get(0).click();
////		allATC.get(1).click();
////		allATC.get(2).click();
////		allATC.get(3).click();
////		allATC.get(4).click();
////		allATC.get(5).click();
////		//OR we can use here for loop
//		for(int i=0; i<allATC.size(); i++)
//		{
//			allATC.get(i).click();
//		}
//		
		
		
	}
}
