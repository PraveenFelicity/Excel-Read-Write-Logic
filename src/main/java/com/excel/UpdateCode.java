package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateCode {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SampleThree\\src\\main\\resources\\source\\sample.xlsx");
		
		FileInputStream F1 = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(F1);
		
		Sheet s = w.getSheet("Details");
		Row r = s.getRow(2);
		Cell c = r.getCell(0);
		String st = c.getStringCellValue();		
		if(st.equals("jonas")) {
			c.setCellValue("Gohan");
		}
		
		FileOutputStream o= new FileOutputStream(f);
		w.write(o);
		
		}
}
