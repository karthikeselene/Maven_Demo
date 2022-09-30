package pages.factory.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

	@FindBy(id="user-name")
	WebElement ele_username;

	@FindBy(id="password")
	WebElement ele_password;

	@FindBy(id="login-button")
	WebElement ele_login_btn;

	public LoginPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public LoginPages enterUserName(String uName) { 
		ele_username.sendKeys(uName);
		return this;
	}

	public LoginPages enterPassword(String pwd) {
		ele_password.sendKeys(pwd);
		return this;
	}

	public LoginPages clickLoginButton() {
		ele_login_btn.click();
		return this;
	}

	public LoginPages validateErrorMessage() {
		return this;

	}

}