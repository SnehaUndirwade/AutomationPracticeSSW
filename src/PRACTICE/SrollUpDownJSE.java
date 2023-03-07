package PRACTICE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollUpDownJSE 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,1500)");		
		Thread.sleep(3000);
//		JS.executeScript("window.scrollBy(0,-1500)");
//		Thread.sleep(3000);
//		JS.executeScript("window.scrollBy(850,0)");
//		Thread.sleep(3000);
//		JS.executeScript("window.scrollBy(-850,0)");
//		Thread.sleep(3000);
//		JS.executeScript("window.scrollBy(200,1300)");		
//		Thread.sleep(3000);
//		JS.executeScript("window.scrollBy(500,360)");
		
	}
}
