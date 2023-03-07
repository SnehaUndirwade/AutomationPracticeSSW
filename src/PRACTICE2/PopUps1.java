package PRACTICE2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps1
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/login/");
		WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		signUp.click();
		WebElement Already = driver.findElement(By.xpath("//a[text()='Already have an account?']"));
		Already.click();
	}
	
}
