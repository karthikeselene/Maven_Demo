package pages;

import org.openqa.selenium.WebDriver;

public class Inventory {
	
	private WebDriver driver;
	
	public Inventory(WebDriver driver) {
		this.driver = driver;
	}
	
	public Inventory validateCurrentUrl() {
		if(driver.getCurrentUrl().contains("inventory.html")) {
			System.out.println("Pass!!!");
		} else {
			throw new RuntimeException("Fail!!!");
		}
		return this;
	}

}