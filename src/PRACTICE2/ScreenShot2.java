package PRACTICE2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class ScreenShot2 
{
	static WebDriver driver;
	public static void Screenshot() throws IOException 
	{
		File TS =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(TS,new File("C:\\Users\\S\\Desktop\\new\\FileTS\\Screenshot2.jpg"));
	}

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Screenshot();
		
		
		
		
		
	}

	
	}

