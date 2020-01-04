package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {
	
		public static void main(String args[]) throws BiffException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		c.manage().window().maximize();
		c.findElement(By.id("txt_unam")).sendKeys("sylix");
		c.findElement(By.id("txt_pass")).sendKeys("admin");
		c.findElement(By.id("Button3")).click();
		FileInputStream m=new FileInputStream("C:\\SeleniumTraining\\ERPTesting.xls");
		Workbook h=Workbook.getWorkbook(m); //Download and upload "jxl file".
		Sheet j=h.getSheet(0);
		int rowcount=j.getRows();
		for(int i=1;i<rowcount;i++) {
			String cusid=j.getCell(1,i).getContents(); //Normal for loop take first "row-column" but data driven concept "column-row".
			Thread.sleep(2000);
			String phno=j.getCell(2,i).getContents();
			Thread.sleep(2000);
						
			
			Thread.sleep(2000);
			c.findElement(By.name("ctl00$ContentPlaceHolder1$txt_customerid")).sendKeys(cusid);
			Thread.sleep(2000);
			c.findElement(By.name("ctl00$ContentPlaceHolder1$txt_phoneno")).sendKeys(phno);
						Thread.sleep(2000);
			
			Select product0=new Select(c.findElement(By.name("ctl00$ContentPlaceHolder1$dd_productcode")));
			product0.selectByVisibleText("PC00133");
			Thread.sleep(2000);
			Select product1=new Select(c.findElement(By.name("ctl00$ContentPlaceHolder1$dd_productname")));
			product1.selectByVisibleText("JAANGRI");
			Thread.sleep(2000);
			Select product2=new Select(c.findElement(By.name("ctl00$ContentPlaceHolder1$dd_bottleneck")));
			product2.selectByVisibleText("asass");
			Thread.sleep(2000);
			Select product3=new Select(c.findElement(By.name("ctl00$ContentPlaceHolder1$dd_dispatch")));
			product3.selectByVisibleText("dfdfdf");
			Thread.sleep(2000);
			c.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_duedate\"]")).click();
			Thread.sleep(1000);
			c.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_duedate_CalendarExtender_day_2_5\"]")).click();
					}
	}

}
