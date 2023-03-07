package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement City1 = driver.findElement(By.xpath("//div[@id='box5']"));//source
		WebElement City2 = driver.findElement(By.xpath("//div[@id='box6']"));//source
		WebElement City3 = driver.findElement(By.xpath("//div[@id='box2']"));//source
		WebElement City4 = driver.findElement(By.xpath("//div[@id='box1']"));//source
		WebElement City5 = driver.findElement(By.xpath("//div[@id='box3']"));//source
		WebElement City6 = driver.findElement(By.xpath("//div[@id='box4']"));//source
		WebElement City7 = driver.findElement(By.xpath("//div[@id='box7']"));//source
		
		WebElement Country1 = driver.findElement(By.xpath("//div[@id='box105']"));//destination
		WebElement Country2 = driver.findElement(By.xpath("//div[@id='box106']"));//destination
		WebElement Country3 = driver.findElement(By.xpath("//div[@id='box102']"));//destination
		WebElement Country4 = driver.findElement(By.xpath("//div[@id='box101']"));//destination
		WebElement Country5 = driver.findElement(By.xpath("//div[@id='box103']"));//destination
		WebElement Country6 = driver.findElement(By.xpath("//div[@id='box104']"));//destination
		WebElement Country7 = driver.findElement(By.xpath("//div[@id='box107']"));//destination
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(City1, Country1).perform();
		act.dragAndDrop(City2, Country2).perform();
		act.dragAndDrop(City3, Country3).perform();
		act.dragAndDrop(City4, Country4).perform();
		act.dragAndDrop(City5, Country5).perform();
		act.dragAndDrop(City6, Country6).perform();
		act.dragAndDrop(City7, Country7).perform();
	}
}
