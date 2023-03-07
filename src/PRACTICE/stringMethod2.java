package PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stringMethod2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\chromedriver.exe");
							
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.facebook.com/");
		
		Driver.manage().window().maximize();
		
		String AxpectedURL = "https://www.facebook.com/";
		
		System.out.println(AxpectedURL);
		
		String ActualURL = Driver.getCurrentUrl();
		
		System.out.println(ActualURL);
		
		if(AxpectedURL.equals(ActualURL))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		Driver.getTitle();
	}
}
