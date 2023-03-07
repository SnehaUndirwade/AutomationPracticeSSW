package PRACTICE2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrame 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\chromedriver_win32\\Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	
	WebElement Frame= driver.findElement(By.xpath("//iframe[@id='frame2']"));
	
	driver.switchTo().frame(Frame);
	
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
	Select s = new Select(dropdown);
	s.selectByVisibleText("Big Baby Cat");
	
	
	 
}
}
