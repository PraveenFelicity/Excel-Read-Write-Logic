
package com.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extra {
	static List<String> l = new LinkedList<String>();
	public static WebDriver driver;
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Class-2\\Driver\\chromedriver.exe");
     driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.flipkart.com");
	WebElement closebtn = driver.findElement(By.xpath("//button[text()='✕']"));
    closebtn.click(); 
    WebElement srch = driver.findElement(By.name("q"));
    srch.sendKeys("Mi Mobiles");
    WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
    search.click();
    Thread.sleep(3000);    
    List<WebElement> results = driver.findElements(By.xpath("//div[contains(@class,'rR')]"));
    File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SampleThree\\target\\Flipkart.xlsx");
    Workbook w = new XSSFWorkbook();
    Sheet s = w.createSheet();
    for (WebElement x : results) {
		String st = x.getText();
		l.add(st);
    	System.out.println(st);
    }
      for (int i = 0; i < l.size(); i++) {
    	Row r = s.createRow(i);
		Cell c = r.createCell(0);
		c.setCellValue(l.get(i));
	}
	FileOutputStream o = new FileOutputStream(f);
	w.write(o);
}
}
