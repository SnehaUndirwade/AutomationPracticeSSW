package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement AlertFrameWin = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[3]"));
		
//		alt.accept();
		AlertFrameWin.click();
				
		WebElement Alert = driver.findElement(By.xpath(("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]")));
		Alert.click();
		
//		WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
//		alertButton.click();
//		Alert alt = driver.switchTo().alert();
//		alt.accept();
//		//normal alert
//		
//		WebElement alertbutton2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
//		alertbutton2.click();
//		Thread.sleep(6000);		
//		alt.accept();
//		//click after 5 second
//		
//		WebElement alertbutton3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		alertbutton3.click();
//		alt.dismiss();
//		//if reject alert
		
		WebElement alertbutton4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		alertbutton4.click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Swapnil");
		//if we have send any keys there
		alt.accept();
		
		
		
		
		
		
	}
}
