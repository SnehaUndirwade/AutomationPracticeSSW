package PRACTICE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//WebElement DropDown = driver.findElement(By.xpath("/html/body/section[6]/div/div/div[1]/input"));
		WebElement DropDown = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[3]/select"));
		//Actions act = new Actions(driver);
		//act.click(DropDown);
		DropDown.click();
		Select s = new Select(DropDown);
		//Select s = new Select(DropDown);
		s.selectByValue("option2");
		//s.selectByVisibleText("Aurangabad");
		//s.selectByVisibleText("Aurangabad");
		
		
		
		
		
		
	}


}
