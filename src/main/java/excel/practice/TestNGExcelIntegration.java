package excel.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGExcelIntegration {

	@DataProvider
	public Object[][] getData() throws IOException{
		Object[][] data = null;
		File file = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(1);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		data = new Object[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		workbook.close();
		return data;
	}

	//    @Test(dataProvider = "getData")
	//    public void testExcelDataProvider(String uName, String pwd, String name, String bValue) {
	//    	System.out.print(uName + " | " + pwd + " | " + name + " | " + bValue + " | ");
	//    	System.out.println(" ");
	//    }
	
	@Test(dataProvider = "getData")
	public void testSauceLab(String uName, String pwd) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("user-name")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
	}

}