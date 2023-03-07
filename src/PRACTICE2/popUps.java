package PRACTICE2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class popUps 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/alerts");
		
		WebElement Alert = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]"));
		Alert.click();
		
//		WebElement Click1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
//		Click1.click();
//		
//		Alert alt = driver.switchTo().alert();
//		alt.accept();
		
		
		//wait.until(null)
//		WebElement Click2 = driver.findElement(By.xpath("(//button[text()='Click me'])[2]"));
//		Click2.click();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
//		wait.until(ExpectedConditions.visibilityOf(Alert));	
//		Thread.sleep(07);
//		Alert alt = driver.switchTo().alert();		
//		alt.accept();
//		alt.dismiss();
//		
//		WebElement Click3 = driver.findElement(By.xpath("(//button[text()='Click me'])[3]"));
//		Click3.click();
//		Alert alt = driver.switchTo().alert();
//		alt.getText();
//		alt.accept();
		
		WebElement Click4 = driver.findElement(By.xpath("(//button[text()='Click me'])[4]"));
		Click4.click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(5);
		alt.sendKeys("Darling");
		
		alt.getText();
		alt.accept();
		
		
		
		
	}
}
