package testng.practices;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Running TestNG @BeforeTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Running TestNG @BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Running TestNG @AfterSuite");
	}	

	@AfterTest
	public void afterTest() {
		System.out.println("Running TestNG @AfterTest");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Running TestNG @BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Running TestNG @AfterClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running TestNG @BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Running TestNG @AfterMethod");
	}

}
