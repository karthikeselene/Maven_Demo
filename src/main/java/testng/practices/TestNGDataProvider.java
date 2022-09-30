package testng.practices;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	@DataProvider
	public Object[][] getData() {
		return new String[][] {
			{"standard_user", "secret_sauce"},
			{"problem_user", "secret_sauce"},
			{"user_name", "qwewfwgwqh7987;"}
		};		
	}
	
	@DataProvider(name = "runthisone")
	public Object[][] getData1() {
		return new Object[][] {
			{"standard_user", "secret_sauce", 1},
			{"problem_user", "secret_sauce", 2},
			{"user_name", "qwewfwgwqh7987;", 3}
		};		
	}
	
	@Test(dataProvider = "getData")
	public void testParameters(String uName, String pwd) {
		System.out.println("Enter User Name: "+uName);
		System.out.println("Enter Password: "+pwd);
	}
	
	@Test(dataProvider = "runthisone")
	public void testParameters1(String uName, String pwd, int num) {
		System.out.println("Enter User Name: "+uName);
		System.out.println("Enter Password: "+pwd);
		System.out.println("Enter Number: "+num);
	}

}
