package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWrite {
public static void main(String[] args) throws Exception {
	File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SampleThree\\src\\main\\resources\\source\\sample.xlsx");
		
	
	Workbook w = new XSSFWorkbook();
	
	Sheet s = w.createSheet("1983");
	
	Row r = s.createRow(0);
	
	Cell c = r.createCell(0);
		
	c.setCellValue("No Future");
	FileOutputStream o= new FileOutputStream(f);
	w.write(o);
	
	}

}

