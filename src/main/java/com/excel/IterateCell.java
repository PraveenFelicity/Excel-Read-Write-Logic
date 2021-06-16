package com.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IterateCell {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SampleThree\\src\\main\\resources\\source\\sample.xlsx");
		
		FileInputStream F1 = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(F1);
		
		Sheet s = w.getSheet("Details");
		
		Row r = s.getRow(2);
			
		for (int i = 0; i <r.getPhysicalNumberOfCells(); i++) {
			Cell c = r.getCell(i);
			System.out.println(c);
		}
		
	}
}

