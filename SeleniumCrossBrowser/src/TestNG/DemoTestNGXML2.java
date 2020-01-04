package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoTestNGXML2 {

	WebDriver driver;

	//@BeforeSuite //only once run for before test
	//@BeforeTest //only once run for before test
	//@BeforeClass //only once run for before test
//	@BeforeMethod //it run every test method before
//	public void before() {
//		System.out.println("hi");
//	}
	
	//@Test(priority=-1) //this is work for last
	//@Test(enabled=false) //Skip test case
	@Test
	public void middleschool() {
		System.out.println("Complete Middle School");

	}

	//@Test(priority=-2)
	//@Test(dependsOnMethods="middleschool") //depending on middleschool so middleschool method fail this method can't run. 
	@Test
	public void highschool() {
		System.out.println("Complete High School");

	}

	//@Test(priority=-3)
	@Test
	public void ugengineering() {
		System.out.println("Complete UG Engineering");
	}

	//@Test(priority=-4) //this is work first
	@Test
	public void pgengineering() {
		System.out.println("Complete PG Engineering");
			}
	}
