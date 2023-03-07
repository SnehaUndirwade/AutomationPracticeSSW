package PRACTICE;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.geom.Dimension2D;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class DAY2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		String actualURL = driver.getCurrentUrl();
		
		//actual URL
		System.out.println(actualURL);
		
		//Get Title
		String actuleTitle = driver.getTitle();
		System.out.println(actuleTitle);
		
		//Browser size setting (Dimension D = new Dimension(350,400);
		org.openqa.selenium.Dimension D = new org.openqa.selenium.Dimension(350,400);
		driver.manage().window().setSize(D);
		
		Thread.sleep(2000);
		
		//refresh
		driver.navigate().refresh();
		//set Position
		org.openqa.selenium.Point p = new org.openqa.selenium.Point(350,250);
		driver.manage().window().setPosition(p);
		
	}

}
