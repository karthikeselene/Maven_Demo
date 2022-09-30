package webdiver.manager.test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchTest {
	
	public ChromeDriver driver = null;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Parameters({"username1", "password1"})
	@Test
	public void test001(String uName, String pwd) {		
		driver.findElement(By.id("user-name")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("inventory.html");
		Assert.assertEquals(true, contains);
	}
	
	@Parameters({"username2", "password2"})
	@Test
	public void test002(String uName, String pwd) {		
		driver.findElement(By.id("user-name")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("inventory.html");
		Assert.assertEquals(true, contains);
	}

}