package pages.factory.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Inventory {	

	private WebDriver driver;

	public Inventory(WebDriver driver) {
		PageFactory.initElements(driver, this);
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