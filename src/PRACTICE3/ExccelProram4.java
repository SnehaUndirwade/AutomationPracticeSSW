package PRACTICE3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExccelProram4 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String path = "H:\\aTESTING CLASSES\\PracticeEccel.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		String Username = workbook.getSheet("Sheet3").getRow(3).getCell(1).getStringCellValue();
		String PassWord = workbook.getSheet("Sheet3").getRow(4).getCell(1).getStringCellValue();
		
		WebElement User = driver.findElement(By.xpath("//input[@id='user-name']"));
		User.sendKeys(Username);
		WebElement Pass = driver.findElement(By.xpath("//input[@id='password']"));
		Pass.sendKeys(PassWord);
		WebElement Submit = driver.findElement(By.xpath("//input[@id='login-button']"));
		Submit.click();
		
//		System.out.println(Username);
//		System.out.println(PassWord);
		
	}
}
