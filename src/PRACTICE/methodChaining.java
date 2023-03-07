package PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodChaining {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		Options O = driver.manage();
		
		Window w = O.window();
		
		w.maximize();
		
		String expectedURL = "https://www.facebook.com/";
		
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		
		if(expectedURL.equals(actualURL))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
	}

}
