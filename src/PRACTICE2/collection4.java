package PRACTICE2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class collection4 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S\\Desktop\\new\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is Open");
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("URL is Open");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Practice = driver.findElement(By.xpath("//a[text()='PRACTICE']"));
		Practice.click();
		
		List <WebElement> ColumnHeader = driver.findElements(By.xpath("//table//tbody//tr//th"));
		System.out.println("Number of Column is:- "+ColumnHeader.size());
		
//		System.out.println(ColumnHeader.get(0).getText());
//		System.out.println(ColumnHeader.get(1).getText());
//		System.out.println(ColumnHeader.get(2).getText());
		
		for( int i=0;i<ColumnHeader.size();i++)
		{
			String Result = ColumnHeader.get(i).getText();
			System.out.println(Result);
		}
		
		List<WebElement> cellData = driver.findElements(By.xpath("//table//tbody//tr//td"));
		System.out.println("number of cell is:- "+cellData+size());
		
		for(int i=0; i<cellData.size(); i++)
		{
//			WebElement Cell = cellData.get(i);
//			String resultCell = Cell.getText();
//			String resultCell = cellData.get(i).getText();
//			System.out.println(resultCell);   
//			OR
			System.out.println(cellData.get(i).getText());
		
		
		}
		

	
	}

	private static String size() {
		// TODO Auto-generated method stub
		return null;
	}
}
