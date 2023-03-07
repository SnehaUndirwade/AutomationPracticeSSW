package PRACTICE2;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotRedBus 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		//TakesScreenshot ts = (TakesScreenshot)driver;
		//File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		//File destFile = new File("C:\\Users\\S\\Desktop\\new\\FileTS\\Screenshot.jpg");
		//FileHandlercopy(sourceFile, destFile);
		
		//TakesScreenshot ts = (TakesScreenshot)driver;
		//File sourceFile= ts.getScreenshotAs(OutputType.FILE);
		//File destFile = new File("C:\\Users\\S\\Desktop\\new\\FileTS\\LoginPagePP.jpg");
		//FileHandlercopy(sourceFile, destFile);
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\S\\Desktop\\new\\FileTS\\Screenshot.jpg") );

		
		
	

	
		
	}

	private static void FileHandlercopy(File sourceFile, File destFile) {
		// TODO Auto-generated method stub
		
	}

	private static void copy(File sourceFile, File destFile) {
		// TODO Auto-generated method stub
		
	}

	
		
	}

