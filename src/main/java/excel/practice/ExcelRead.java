package excel.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {

		//Used to identify the file which stored in project location
		File file = new File("./data/TestData.xlsx");

		//Used to read given file in the above mentioned location
		FileInputStream fis = new FileInputStream(file);

		//Used to open and read the excel file which has the extension called .xlsx
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		//Used to identify the sheet in your workbook using the sheet name
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		//Used to fetch the string value in the given row and column interaction - dynamic
		int rowCount = sheet.getLastRowNum() + 1;
		int colCount = sheet.getRow(0).getLastCellNum();	

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " | ");							
			}
			System.out.println(" ");
		}

		//Used to fetch the string value in the given row and column interaction - static
		//		String value_one = sheet.getRow(1).getCell(0).getStringCellValue();
		//		String value_two = sheet.getRow(1).getCell(1).getStringCellValue();
		//		String value_three = sheet.getRow(1).getCell(2).getStringCellValue();
		//		
		//		System.out.println(value_one);
		//		System.out.println(value_two);
		//		System.out.println(value_three);

		workbook.close();

	}

}