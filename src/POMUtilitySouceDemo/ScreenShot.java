package POMUtilitySouceDemo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v101.page.Page;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

public class ScreenShot 
{
//	WebDriver driver;
	
//	public static void main(String[] args)
		
//	}
	public static void GetScreenShot(WebDriver driver) throws IOException
	{
		Date d = new Date();
		
		DateFormat d2 = new SimpleDateFormat("mm/dd/yyyy&hh:mm:ss");	
		String Date = d2.format(d);
		
//		System.out.println(Date); 
		
//		Calendar Cal = Calendar.getInstance();
//		Date Time = Cal.getTime();
//		String TimeStamp = Time.toString().replace(" ","");
//		System.out.println(TimeStamp);
		
		
		File TS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(TS, new File("C://Users//S//Desktop//new//FileTS//SauceDemoScreenshots.jpg"));
	}
//	
//	public ScreenShot(WebDriver driver)
//	
//	{
//		this.driver = driver;
//		
//		PageFactory.initElements(driver,this);
		
//	}
//
//	public static void TakesScreenshot(WebDriver driver2) {
//		// TODO Auto-generated method stub
//		
//	}
}
