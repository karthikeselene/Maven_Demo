package pages.chain.pattern.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001 {

	ChromeDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();		

		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}	

	@Test
	public void test_TC001() {		

		new LoginPages(driver)
		.enterUserName("standard_user")
		.enterPassword("secret_sauce")
		.clickLoginButton()
		.validateCurrentUrl();	

	}

	@AfterMethod
	public void aferMethod() {

		driver.close();

	}

}
