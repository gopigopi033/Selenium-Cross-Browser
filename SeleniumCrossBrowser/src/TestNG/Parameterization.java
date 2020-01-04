package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	//***********This is First Way*************//
	@Test
	@Parameters({"name","place"})
	public void parameter2(String he,String pl) {
		System.out.println(he);
		System.out.println(pl);

		//************This is second Way**************//
//		@Parameters({"name","place"}) //this concept cannot work "testng" only work "testsuite" this is called parametarization.
//		@Test                                // just you right on the "testing.xml" file and run as testsuite.
//		public void parameter1(String he,String pl) {
//			System.out.println("He Name is: "+name);
//			System.out.println("Coming from: "+place);

	}

}
