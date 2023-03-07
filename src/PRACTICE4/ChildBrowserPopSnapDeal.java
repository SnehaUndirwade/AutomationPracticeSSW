package PRACTICE4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ChildBrowserPopSnapDeal 
{
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\chromedriver_win32\\Chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.snapdeal.com/");
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().window().maximize();
		 
		 WebElement TShirt = driver.findElement(By.xpath("(//div[@class='product_name'])[6]"));
		 TShirt.click();
		 List<String> AllPageAddresses = new ArrayList<String>(driver.getWindowHandles());
		 
		 driver.switchTo().window(AllPageAddresses.get(1));
		 
		 WebElement AddToCart = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		 AddToCart.click();
		
	}
}
