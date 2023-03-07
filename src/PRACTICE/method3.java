package PRACTICE;

import java.awt.Point;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class method3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		
		Dimension D = new Dimension(350,400);
		driver.manage().window().setSize(D);
		
		Thread.sleep(2000);
		
		//refresh
		driver.navigate().refresh();
		//set Position
		
	   org.openqa.selenium.Point P = new org.openqa.selenium.Point(370,250);
	   driver.manage().window().setPosition(P);
		

	}

}
