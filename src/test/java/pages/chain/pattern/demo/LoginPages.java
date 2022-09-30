package pages.chain.pattern.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReadProperties;

public class LoginPages {

	private WebDriver driver;

	public LoginPages(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPages enterUserName(String uName) { 
		driver.findElement(By.id(ReadProperties.getLocatorValue("LoginPage", "login.username.text"))).sendKeys(uName);
		return this;
	}

	public LoginPages enterPassword(String pwd) {
		driver.findElement(By.id(ReadProperties.getLocatorValue("LoginPage", "login.password.text"))).sendKeys(pwd);
		return this;
	}

	public Inventory clickLoginButton() {
		driver.findElement(By.id(ReadProperties.getLocatorValue("LoginPage", "login.login.button"))).click();
		return new Inventory(driver);
	}
	
	public LoginPages validateErrorMessage() {
		return this;		
	}

}