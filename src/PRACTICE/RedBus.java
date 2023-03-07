package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBus 
{
public static void main(String[] args) 
{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebElement From = driver.findElement(By.xpath("//html//div[2]//div//div[2]//input[1]"));
		From.sendKeys("nagpur");
		WebElement From1 = driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[1]/div/ul/li"));
		//From1.sendKeys("nagpur");
		
		Actions act = new Actions(driver);
		act.moveToElement(From1);
		
		WebElement To = driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[2]/div/input"));
		To.sendKeys("Pune");
		
		WebElement Search = driver.findElement(By.xpath("//html//div[2]//div[2]//div[1]//button"));
		Search.click();
		
		WebElement Date = driver.findElement(By.xpath("//html//div[2]//div//div[3]//input[1]"));
		Date.click();
		
		WebElement ExactMonth = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[2]"));
		ExactMonth.click();
		
		WebElement ExactDate = driver.findElement(By.xpath("//td[text()='26']"));
		ExactDate.click();
		
		
		Search.click();
		
		
		
		
		
		
		
}

private static Actions Actions(WebDriver driver) {
	// TODO Auto-generated method stub
	return null;
}


}

