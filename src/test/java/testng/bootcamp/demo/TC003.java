package testng.bootcamp.demo;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003 {
	
	@Test
	public void googleTest() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver dirver = new ChromeDriver();
	}
	
	@Test
	public void firefoxTest() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
	}

}
