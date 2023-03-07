package Annotation;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion3 
{
//	@Test
//	public void Assertion1()
//	{
//		
//		
//		
//		String AtualValue    = "Swag Labs";
//		String ExpectedValue = "Swag Lab";
//		
//		SoftAssert Soft = new SoftAssert();
//		Soft.assertEquals(AtualValue,ExpectedValue,"title not matching");
//		Soft.assertAll();
//	}
	
	@Test
	public void AssertTrueOrFalse()   // this method also available in SoftAssert method
	{
//		Assert.assertTrue(true); //Pass
//		Assert.assertTrue(false); // Fails
		Assert.assertFalse(true); //Fails
//		Assert.assertFalse(false); //True
//		Assert.assertTrue(true);
	}
}
