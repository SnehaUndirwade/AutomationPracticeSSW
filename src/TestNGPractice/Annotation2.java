package TestNGPractice;

import org.testng.annotations.Test;

public class Annotation2 
{
	
	@Test(priority=-1,invocationCount=5,dependsOnMethods="Method5")
	public void Method1()
	{
		System.out.println("Method 1");
	}
	
	@Test(priority= 2,enabled=false) //not run this method due to "Enabled = false" Method
	public void Method2()
	{
		System.out.println("Method 2");
		
	}
	
	@Test(priority = 3)
	public void Method3()
	{
		System.out.println("Method 3");
	}
	
	@Test(priority = 4,dependsOnMethods="Method1")
	public void Method4()
	{
		System.out.println("Method 4");
	}
	
	@Test(priority = 0,timeOut=200)
	public void Method5()
	{
		System.out.println("Method 5");
	}
}
