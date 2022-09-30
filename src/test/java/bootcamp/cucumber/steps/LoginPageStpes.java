package bootcamp.cucumber.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPages;
import pages.chain.pattern.demo.Inventory;

public class LoginPageStpes {

	WebDriver driver;

	@Given("User want to purchase the sauce lab merchandise product on the offical cart site")
	public void user_want_to_purchase_the_sauce_lab_merchandise_product_on_the_offical_cart_site() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("Regitered user able to login with valid user credentials {string} and {string}")
	public void regitered_user_able_to_login_with_valid_user_credentials_and(String uName, String pwd) {
		new LoginPages(driver)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLoginButton();
	}

	@Then("User able to redirect into the inventory page")
	public void user_able_to_redirect_into_the_inventory_page() throws InterruptedException {
		Thread.sleep(3000);
		new Inventory(driver)
		.validateCurrentUrl();
	}

	@Given("I am on the login screen")
	public void i_am_on_the_login_screen() {
		System.out.println("I am on the login screen");
	}
	
	@When("I enter my passcode")
	public void i_enter_my_passcode() {
		System.out.println("I enter my passcode");
	}
	
	@Then("I press the ok button")
	public void i_press_the_ok_button() {
		System.out.println("I press the ok button");
	}

}