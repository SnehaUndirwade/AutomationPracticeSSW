package PopUps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUps 
{
	public static void main(String [] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement JoinNow = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/a/img"));
		JoinNow.click();
		
		List<String> allpageAdd = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(allpageAdd);
		//we convert into set to list
		//we get web page addresses By method driver.getWindowHandels()
		
		driver.switchTo().window(allpageAdd.get(1));
		
		WebElement Registration = driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
		Registration.click();
		
		WebElement EnterName = driver.findElement(By.xpath("//input[@id='first-name']"));
		EnterName.sendKeys("Swapnil");
		
	}
	
}
