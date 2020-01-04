package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void test1(){
	try{
	Assert.assertTrue(2<1);
	System.out.println("Assertion Failed in Test 1");
	Assert.assertFalse(1>0);
	System.out.println("Assertion Failed in Test 1");
	Assert.assertEquals("Sample", "Sample");
	System.out.println("Assertion Passed in Test 1");
	} catch(AssertionError ae){
		System.out.println("Test 1 Fully Failed");
	//ae.printStackTrace();  //This is for Selenium normal error message display
	}
	}

	@Test
	public void test2(){
	try{
	Assert.assertTrue(2>1);
	System.out.println("Assertion passed in Test 2");
	Assert.assertFalse(1<0);
	System.out.println("Assertion passed in Test 2");
	Assert.assertEquals("Sample", "Sample");
	System.out.println("Assertion Passed in Test 2");
	} catch(AssertionError ae){
	ae.printStackTrace();
	}
	
	}
	}
