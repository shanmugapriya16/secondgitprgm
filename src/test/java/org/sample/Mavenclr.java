package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mavenclr {

	public static String getdat(int rowno,int colno) throws IOException {
		File f = new File("E:\\Users\\Rajesh Mohan\\eclipse-workspace\\Clearmaven\\exce\\test.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(fi);
		Sheet sheet = b.getSheet("login");
		Row r = sheet.getRow(rowno);
		Cell c = r.getCell(colno);
		int cellType = c.getCellType();
		String name = "";
		if(cellType==1) {
			 name = c.getStringCellValue();
		}
		
		return name;
	
		
	}
	
	
}
