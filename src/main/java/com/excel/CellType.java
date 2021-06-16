package com.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CellType {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SampleThree\\src\\main\\resources\\source\\sample.xlsx");
		
		FileInputStream F1 = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(F1);
		
		Sheet s = w.getSheet("Details");
		for (int i = 1; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				org.apache.poi.ss.usermodel.CellType ct = c.getCellType();
				System.out.println(ct);
			}
		}

	}
}