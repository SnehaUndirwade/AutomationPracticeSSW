package PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethods 
{
public static void main(String[] args) throws InterruptedException 
{
   System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    //Thread.sleep(5000);
    driver.navigate().to("https://www.selenium.dev/");
    
    driver.navigate().back();
    //Thread.sleep(5000);
    driver.navigate().forward();
    Thread.sleep(5000);
    driver.navigate().refresh();
    //driver.manage().window().minimize();
    //driver.close();
    driver.quit();
    
    
}
}
