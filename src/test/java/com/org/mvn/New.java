package com.org.mvn;


import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

static WebDriver driver;
	
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SampleThree\\driver1\\chromedriver.exe");
	    driver = new ChromeDriver ();
		driver.get("http://facebook.com/");
	}
	
	@Before   
	public void Start () {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test 
	public void test1() {
		Assert.assertTrue(driver.getCurrentUrl().contains("face"));
		Assert.assertTrue(driver.getTitle().contains("Face"));
		driver.findElement(By.id("email")).sendKeys("Praveen");
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("8754398");
		Assert.assertEquals(Password.getAttribute("value"), "8754398");
		System.out.println("Success");
	}
		
	@After
	public void end () {
		Date d = new Date();
		System.out.println(d);
	}
		
	@AfterClass
	public static void quit() {
		driver.quit();
	}
	
}
