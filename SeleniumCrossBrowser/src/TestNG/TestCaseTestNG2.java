package TestNG;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCaseTestNG2 {
	
	WebDriver driver;

	@BeforeMethod  //these are annotations
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
			}

	@Test
	public void login() {
		driver.findElement(By.id("txt_unam")).sendKeys("sylix");
		driver.findElement(By.id("txt_pass")).sendKeys("admin");
		driver.findElement(By.id("Button3")).click();
	}
	
	@Test
	public void f() throws BiffException, IOException, InterruptedException {
		FileInputStream m=new FileInputStream("C:\\SeleniumTraining\\ERPTesting.xls");
		Workbook h=Workbook.getWorkbook(m); //Download and upload "jxl file".
		Sheet j=h.getSheet(0);
		int rowcount=j.getRows();
		for(int i=1;i<rowcount;i++) {
			String cusid=j.getCell(1,i).getContents(); //Normal for loop take first "row-column" but data driven concept "column-row".
			Thread.sleep(2000);
			String phno=j.getCell(2,i).getContents();
			Thread.sleep(2000);
			String conname=j.getCell(3,i).getContents();
			Thread.sleep(2000);
			String mobno=j.getCell(4,i).getContents();
			Thread.sleep(2000);
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_customerid")).sendKeys(cusid);
			Thread.sleep(2000);
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_phoneno")).sendKeys(phno);
			Thread.sleep(2000);
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_phoneno")).sendKeys(phno);
			Thread.sleep(2000);
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_contactname")).sendKeys(conname);
			Thread.sleep(2000);
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt_mobileno")).sendKeys(mobno);
			}
	}

	@AfterMethod
	public void afterMethod() {
	}

}
