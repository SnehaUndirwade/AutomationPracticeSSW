package PRACTICE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frameConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		WebElement FrameElement = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
		//main page--> Switch--->frame Concept
		driver.switchTo().frame(FrameElement);
		
		//dropdown elements
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
		dropDown.click();
		
		Select s = new Select(dropDown);
		s.selectByVisibleText("Baby Cat");
		
	}

}
