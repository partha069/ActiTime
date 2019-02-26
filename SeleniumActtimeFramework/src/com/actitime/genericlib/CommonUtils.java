package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CommonUtils {
	String filePath = "./testdata/testData.xlsx";
	public String getExcelData(String sheetName , int rowNum, int colNum)
			throws Throwable
	{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();		
		return data;
	}
	
	public Properties getPropertyObj() throws Throwable{
		String path = "./testdata/commondata.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties pObj = new Properties();
		pObj.load(fis);
		return pObj;
	}
}
