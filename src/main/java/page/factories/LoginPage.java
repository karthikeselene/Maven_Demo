package page.factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement ele_username;
	
	@FindBy(id="password")
	WebElement ele_password;
	
	@FindBy(id="login-button")
	WebElement ele_login_btn;
	
	@FindBy(xpath="//h3[@data-test='error']")
	WebElement ele_error_msg;	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String uName) {
		ele_username.sendKeys(uName);
	}
	
	public void enterPassword(String pwd) {
		ele_password.sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		ele_login_btn.click();
	}
	
	public boolean verifyCurrentUrlInLoginPage() {
		String currentUrl = driver.getCurrentUrl();
		boolean bValue = currentUrl.equals("https://www.saucedemo.com/");
		return bValue;
	}
	
	public boolean verfiyTheErrorMessage(String expected) {
		String actual = ele_error_msg.getText();
		boolean bValue = actual.equals(expected);
		return bValue;
	}

}