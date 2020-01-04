package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	SoftAssert sa= new SoftAssert();
	
//*******This is correct method also show failed test*******//	
	@Test
	public void test1(){
	sa.assertTrue(2<1);
	System.out.println("Assertion Failed");
	sa.assertFalse(1<2);
	System.out.println("Assertion Failed");
	sa.assertEquals("Sample", "Failed");
	System.out.println("Assertion Failed");
	sa.assertAll();
		}
}	
	
	
	
	//*****Using try catch so test fail but below console window show passed********//
		/*
		 * public void test1(){
		 *  try {
		 *   sa.assertTrue(2<1);
		 * System.out.println("Assertion Failed"); 
		 * sa.assertFalse(1<2);
		 * System.out.println("Assertion Failed"); 
		 * sa.assertEquals("Sample", "Failed");
		 * System.out.println("Assertion Failed"); 
		 * sa.assertAll(); 
		 * }catch(AssertionError ae){ 
		 * ae.printStackTrace();
		 *  System.out.println("Test fail but execute"); 
		 *  }
		 */		

	

