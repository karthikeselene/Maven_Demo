package factory.method.design.pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver(String browseName) {
		BrowserType browserType = BrowserType.valueOf(browseName.toUpperCase());
		switch (browserType) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(); 
		default:
			throw new RuntimeException("Our factory method right now support only CHROME and FIREFOX");
		}
		return driver;
	}

}