package bootcamp.excel.demo;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelUtility;

public class ReadExcel {
	
	@DataProvider
	public String[][] getData() throws IOException {
		return ExcelUtility.readExcelData("TestData", 0);	
	}

	@Test(dataProvider = "getData")
	public static void main(String uName, String pwd, String name, String bValue) throws IOException {		
		System.out.print(uName +" | "+ pwd +" | "+ name +" | "+ bValue +" | ");
		System.out.println(" ");
	}	

	public static String getDataFromExcel(int rowIndex, int colIndex) throws IOException {
		String value;
		// Step 1 Create the object for XSSFWorkbook class and pass file path of the excel file location
		XSSFWorkbook workBook = new XSSFWorkbook("./data/TestData.xlsx");
		// Stpe 2 use getSheetAt method to get sheet and store it one reference variable of XSSFSheet class
		XSSFSheet sheet = workBook.getSheetAt(0);
		// Step 3 use getRow method to get the rows from the current sheet and use the index to select paritcular one 
		XSSFRow row = sheet.getRow(rowIndex);
		// Step 4 use getCell method to get the particular cell (0, 0)
		XSSFCell cell = row.getCell(colIndex);
		// Step 5 use getStringCellValue method to get value from the given cell
		value = cell.getStringCellValue();
		// Step 6 Close the workbook
		workBook.close();
		return value;
	}	

}