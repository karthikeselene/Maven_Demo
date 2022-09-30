package testng.bootcamp.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC001 {
	
	@Test(dataProvider = "getData")
	public void testdata(String name, int age, String city) {
		System.out.println(name + " | " + age + " | "+ city + " | ");		
	}
	
	@DataProvider(parallel = true)
	public Object[][] getData() {
		return new Object[][] {
			{"Karthi", 32, "Chennai"},
			{"Ravi", 50, "Madurai"}			
		};
	}

}