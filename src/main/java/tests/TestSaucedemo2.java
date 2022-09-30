package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.InventoryPage;
import pages.LoginPage;




public class TestSaucedemo2 {
	
	WebDriver driver;
	LoginPage login;
	InventoryPage inventory;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testValidLoginCredentials() {		
		login = new LoginPage(driver);
		login.enterUserName("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLoginBtn();
		
		inventory = new InventoryPage(driver);
		Assert.assertEquals(true, inventory.verifyCurrentUrlAsInventory());
		inventory.clickBurgerMenu();
		inventory.clickLogoutMenu();
	}
	
	@Test
	public void testLockedOutUser() {
		login = new LoginPage(driver);
		login.enterUserName("locked_out_user");
		login.enterPassword("secret_sauce");
		login.clickLoginBtn();
		Assert.assertEquals(true, login.verifyCurrentUrlInLoginPage());
		Assert.assertEquals(true, login.verfiyTheErrorMessage("Epic sadface: Sorry, this user has been locked out."));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
