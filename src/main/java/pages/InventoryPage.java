package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	
	private WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean verifyCurrentUrlAsInventory() {
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("inventory.html");
		return contains;
	}
	
	public void clickBurgerMenu() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
	}
	
	public void clickLogoutMenu() {
		driver.findElement(By.id("logout_sidebar_link")).click();
	}

}