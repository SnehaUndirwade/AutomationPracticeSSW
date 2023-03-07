package PRACTICE2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		WebElement singIn = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions act = new Actions(driver);
		act.click(singIn).perform();
		//WebElement singIn1 = driver.findElement(By.xpath("//span[text()='Sign in'][1]"));
		//act.doubleClick(singIn);
		//singIn.click();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='ap_email']"));
		userName.sendKeys("swapnilswalde@gmail.com");
		
		WebElement Continue = driver.findElement(By.xpath("//html//div//span//input"));
		act.click(Continue).perform();
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		Password.sendKeys("0123456789");//input[@id='signInSubmit']
		
		WebElement SubmitButton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		//act.click(SubmitButton).perform();
		SubmitButton.click();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		
		WebElement MyAcButton = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));
		//act.click(MyAcButton).perform();
		act.moveToElement(MyAcButton).perform();
		
		WebElement signOut = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[2]/a[13]/span"));
		act.click(signOut).perform();
		//act.moveToElement(signOut).perform();
		//signOut.click();//span[text()='Sign Out']
		
		
		
	}
}
