package Annotation;

import org.testng.annotations.Test;

public class TestAnno2 
{

	@Test
	public void method1()
	{
		System.out.println("Method:- 1");
	}
	
	@Test(dependsOnMethods= {"method7"})
	public void method2()
	{
		System.out.println("Method:- 2");
	}
	
	@Test(priority=1)
	public void method3()
	{
		System.out.println("Method:- 3");
	}
	
	@Test(enabled=false)//if we dont want to run this method then use use this method
	public void method4()
	{
		System.out.println("Method:- 4");
	}
	
	@Test(timeOut=2000)
	public void method5()
	{
		System.out.println("Method:- 5");
	}
	
	@Test(invocationCount=7)
	public void method6()
	{
		System.out.println("Method:- 6");
	}
	
	@Test
	public void Amethod7()//Test method run as Alfabetically
	{
		System.out.println("Method:- 7");
	}
}
