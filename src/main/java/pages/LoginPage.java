package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String uName) {
		driver.findElement(By.id("user-name")).sendKeys(uName);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		driver.findElement(By.id("login-button")).click();
	}
	
	public boolean verifyCurrentUrlInLoginPage() {
		String currentUrl = driver.getCurrentUrl();
		boolean bValue = currentUrl.equals("https://www.saucedemo.com/");
		return bValue;
	}
	
	public boolean verfiyTheErrorMessage(String expected) {
		String actual = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		boolean bValue = actual.equals(expected);
		return bValue;
	}

}