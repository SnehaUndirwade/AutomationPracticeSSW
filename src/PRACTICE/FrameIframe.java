package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameIframe 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		WebElement IFrame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
//		driver.switchTo().frame(IFrame);
//		WebElement selAnimal = driver.findElement(By.xpath("//select[@id='animals']"));
//		selAnimal.click();
//		Select s = new Select(selAnimal);
//		s.selectByVisibleText("Baby Cat");
		
		
		
		
		
		
	}
}
