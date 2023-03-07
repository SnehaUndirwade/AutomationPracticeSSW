package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQA 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		WebElement elements = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]"));
		Actions act = new Actions(driver);
		act.click(elements).perform();
		//elements.click();
		
		WebElement buttons = driver.findElement(By.xpath("//li[@id='item-4'][1]"));
		
		act.doubleClick(buttons).perform();
		
		WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		
		act.doubleClick(DoubleClick).perform();
		
		WebElement RightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		act.contextClick(RightClick).perform();
		
		WebElement ClickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		act.click(ClickMe).perform();
		
	}
}
