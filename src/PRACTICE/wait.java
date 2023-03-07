package PRACTICE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//implicitly wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		WebElement UserID = driver.findElement(By.xpath("//input[@id='email']"));
		UserID.sendKeys("kyswapnil@rediffmail.com");
		
		WebElement Pass = driver.findElement(By.xpath("//input[@id='pass']"));
		Pass.sendKeys("Ssw@1991");
		
		//EXPLICIT WAIT 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
					// OR OR OR OR OR OR
		wait.until(ExpectedConditions.visibilityOf(driver.findElement( By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"))));
		
		WebElement LogIn = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		LogIn.click();

	}

}
