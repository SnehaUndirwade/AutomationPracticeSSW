package PRACTICE2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 
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
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='ap_email']"));
		userName.sendKeys("swapnilswalde@gmail.com");
		
		WebElement Continue = driver.findElement(By.xpath("//html//div//span//input"));
		act.click(Continue).perform();
		
		WebElement Password = driver.findElement(By.xpath("//html//div//div[2]//div[2]//div[1]//form//div[1]//div[1]//input[1]"));
		Password.sendKeys("0123456789");//input[@id='signInSubmit']
				
		
		WebElement SubmitButton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		//act.click(SubmitButton).perform();
		SubmitButton.click();
		
		WebElement SearchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchBar.sendKeys("Oneplus nord n200");
		
		WebElement Search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		act.click(Search).perform();
		
		WebElement OnePlusMobile = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
		act.click(OnePlusMobile).perform();//html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span
		
		WebElement AddToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		act.click(AddToCart).perform();
		
		driver.navigate().back();//a[@id='nav-cart']
		
		//WebElement close = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/a"));
		//act.click(close).perform();
		
		WebElement AddToMyCart = driver.findElement(By.xpath("//a[@id='nav-cart']"));
		act.click(AddToMyCart).perform();
		
		WebElement DeleteMyCart = driver.findElement(By.xpath("//input[@name='submit.delete.C9c9997e6-a024-45bd-ad8d-f2d9adf258fc']"));
		act.click(DeleteMyCart).perform();
		
		
		WebElement Myac = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		act.moveToElement(Myac).perform();
		
		WebElement signOut = driver.findElement(By.xpath("//span[text()='Sign Out']"));
		act.click(signOut).perform();
		
		
		
	}
}
