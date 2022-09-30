package testng.practices;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	
	@Parameters({"username", "password"})
	@Test
	public void testParameters(String uName, String pwd) {
		System.out.println("Enter User Name: "+uName);
		System.out.println("Enter Password: "+pwd);
	}

}