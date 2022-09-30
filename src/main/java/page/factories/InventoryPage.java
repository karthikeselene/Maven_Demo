package page.factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	
	private WebDriver driver;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement ele_burger_menu;
	
	@FindBy(id="logout_sidebar_link")
	WebElement ele_logout_menu;
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyCurrentUrlAsInventory() {
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("inventory.html");
		return contains;
	}
	
	public void clickBurgerMenu() {
		ele_burger_menu.click();
	}
	
	public void clickLogoutMenu() {
		ele_logout_menu.click();
	}

}