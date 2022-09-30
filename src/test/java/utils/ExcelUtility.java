package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static String[][] readExcelData(String fileName, int sheetIndex) {
		String[][] data = null;
		XSSFWorkbook workBook;
		try {
			workBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
			XSSFSheet sheet = workBook.getSheetAt(sheetIndex);
			int rowCount = sheet.getLastRowNum();		
			int colCount = sheet.getRow(0).getLastCellNum();
			data = new String[rowCount][colCount];
			for (int i = 1; i <= rowCount; i++) {			
				for (int j = 0; j < colCount; j++) {				
					data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				}			
			}
			workBook.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return data;
	}

}