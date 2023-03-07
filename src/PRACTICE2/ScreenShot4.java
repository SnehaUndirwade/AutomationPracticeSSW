package PRACTICE2;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;

public class ScreenShot4 
{
	static WebDriver driver;
	public static void ScreenShot()
	{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		Date date = new Date(0);
		String date1= dateFormat.format(date);
	
	
	}
	public static void main(String[] args) 
	{
		System.setProperty("webdriver,chrome,driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		
	}
}
