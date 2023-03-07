package PRACTICE2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/alerts");
		
//		WebElement Click4 = driver.findElement(By.xpath("(//button[text()='Click me'])[4]"));
//		Click4.click();
//		Alert alt = driver.switchTo().alert();
//		Thread.sleep(5);
//		alt.sendKeys("Darling");
//		
//		alt.getText();
//		alt.accept();
		
		WebElement Click2 = driver.findElement(By.xpath("(//button[text()='Click me'])[2]"));
		Click2.click();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
//		wait.until(ExpectedConditions.visibilityOf(Alert));	
		Thread.sleep(07);
		Alert alt = driver.switchTo().alert();		
		alt.accept();
//		alt.dismiss();
	}
}
