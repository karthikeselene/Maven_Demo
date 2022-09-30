package factory.method.design.pattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC001 {
	
	public WebDriver driver;
		
	@Test(dataProvider = "getData")
	public void test_TC001(String browser) {
		driver = BrowserFactory.getDriver(browser);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.close();
	}
	
	@DataProvider
	public String[][] getData(){
		return new String[][] {
			{"Chrome"},
			{"Firefox"}
		};
	}

}