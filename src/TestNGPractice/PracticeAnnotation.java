package TestNGPractice;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
public class PracticeAnnotation 
{

	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method ");
	}
	
	@Test
	public void TestMethod()
	{
		System.out.println("Test Method1 ");
	}
	
	@Test
	public void TestMethod2()
	{
		System.out.println("Test Method2 ");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
		
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}
}
