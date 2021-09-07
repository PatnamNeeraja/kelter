package com.kelter.GenericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Jagadeesh
 *
 */
public class FileLib {


	/**
	 * This generic reusable method is used to read the data from property file
	 * @param propPath
	 * @param key
	 * @return propValue
	 * @throws Throwable
	 */
	public String readPropertyData (String proPath, String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(proPath);
		Properties prop = new Properties();
		prop.load(fis);
		String propValue = prop.getProperty(key, "Incorrect key");
		return propValue;
	}
	
	/**
	 * This generic reusable method is used to read the data from Excel file
	 * @param path
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return excelValue
	 * @throws Throwable
	 */
	public String readExceldata(String path, String sheetName, int row, int cell )
		throws Throwable
		
		{
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			String excelValue = wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
			return excelValue;
		
		}
	/**
	 * This generic reusable method is used to write the data inside excel file
	 * @param path
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data
	 * @throws Throwable
	 */
	/*public void writeExcelData(String path, String sheetName, int cell, String data) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).createCell(cell);
		
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
	}*/
	/**
	 * This generic reusable method is used to count the total rows filled in any sheet of excel file
	 * @param path
	 * @param sheet
	 * @return rowCount
	 * @throws Throwable
	 */
	public int getRowCount (String path, String sheet) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory .create(fis);
		int rowCount = wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	}
	 
}
 
