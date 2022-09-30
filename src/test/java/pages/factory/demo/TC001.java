package pages.factory.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001 {
	
		
	@Test
	public void test_TC001() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		new LoginPages(driver)
		.enterUserName("standard_user")
		.enterPassword("secret_sauce")
		.clickLoginButton();
		
		new Inventory(driver)
		.validateCurrentUrl();
		
		driver.close();
	}

}
