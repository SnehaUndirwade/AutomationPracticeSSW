package PRACTICE2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShot3 
{
	static WebDriver driver;
	public static void ScreenShot() throws IOException 
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String formattedDate = sdf.format(date);
		
		//Date d = new Date();
		//DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		//String date = d1.format(d);

		
		File TS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(TS, new File("C:\\Users\\S\\Desktop\\new\\FileTS\\"+formattedDate+"Screenshot3.jpg"));
		//Files.copy(TS, new File("C:\\Users\\S\\Desktop\\new\\FileTS\\Screenshot3.jpg"));
	}
	
	
	

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		ScreenShot();
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
		Username.sendKeys("kyswapnil@rediffmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		Password.sendKeys("Ssw@1991");
		
		WebElement LogIn = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		Actions act = new Actions(driver);
		//act.click(LogIn);
		LogIn.click();
		ScreenShot();
		
		//WebElement Like = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[4]/div/div/div[4]/div/div/div/div/div/div/div/div/div/div/div/div[8]/div/div[4]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]"));
		//act.click(Like);
		
		//WebElement MyProfile = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/div/svg/g/image"));
		//act.click(MyProfile);
		
		//WebElement LogOut = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]"));
		//act.click(LogOut);
		
		
	}
}
