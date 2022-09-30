package testng.bootcamp.demo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC002 {	
	
	@Test
	public void hardAssertion() {
		AssertJUnit.assertEquals(true, false);
		System.out.println("This is the hard assertion");
	}
	
	@Test
	public void softAssertion() {
		SoftAssert softAssert = new SoftAssert();
		AssertJUnit.assertEquals(true, false);
		System.out.println("This is the soft assertion");
	}

}