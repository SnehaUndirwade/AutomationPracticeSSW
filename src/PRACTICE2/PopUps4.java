package PRACTICE2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps4 
{


	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		WebElement LogIn2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a"));
		LogIn2.click();
		
		WebElement UserName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		UserName.sendKeys("8459429208");
		
		WebElement PassWord = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		PassWord.sendKeys("0123456789");
		
		WebElement Continue = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		Continue.click();
		
		WebElement Search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		Search.sendKeys("Asus zenfone max m1 pro"); 
		
		WebElement Asusm1 = driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[2]"));		
		Asusm1.click();
		
		List<String> allWebAdd = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println("All Web Page Address:- "+allWebAdd);
		
//		driver.switchTo().window(allWebAdd.get(2));
		
		
//		WebElement Asusm1noti = driver.findElement(By.xpath("//button[text()='NOTIFY ME']"));		
//		Asusm1noti.click();
//		Alert alt = driver.switchTo().alert();
//		alt.dismiss();
//		System.out.println("end of program");
		
		
		
	}
}
