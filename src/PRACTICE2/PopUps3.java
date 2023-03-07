package PRACTICE2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps3 
{


public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://vctcpune.com/");
	
	
	WebElement startSelPrac = driver.findElement(By.xpath(("(//a[text()='Start Selenium Practice'])[1]")));
	startSelPrac.click();
	String Title = driver.getTitle();
	System.out.println(Title);
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	
//	List<String> startSelPrac = new List<String>(driver.getWindowHandles());
	List<String> allPageadd = new ArrayList<String>(driver.getWindowHandles());
	
	System.out.println("All WebPage Address is:- "+allPageadd);
	
	driver.switchTo().window(allPageadd.get(1));
	
	WebElement TextBox = driver.findElement(By.xpath(("//input[@id='autocomplete']")));
	TextBox.sendKeys("Darling");
	
	System.out.println("End of Pogram");
	
	
}
}
