package com.utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataprovider {
	
	public static XSSFWorkbook wb;
	String path = "C:\\Users\\Rohit\\eclipse-workspace\\Batch12_Framework3\\testdata\\Test.excel.xlsx";
	
	FileInputStream fis1 = new FileInputStream(path);
	wb = new XSSFWorkbook(fis1);	
	}
public String getStringData(String sheetname, int i, int j) {
	return wb.getSheet(sheetname).getRow(0).getCell(0).getStringCellValue();
		
}

