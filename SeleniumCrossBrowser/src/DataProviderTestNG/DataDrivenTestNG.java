package DataProviderTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTestNG {
	
	String[][] data=null;
	
	@DataProvider(name="logindata")
	public String[][] loginDataProvider() throws BiffException, IOException{
		data=GetExcelData();
		return data;
	}
	
	public String[][] GetExcelData() throws BiffException, IOException {
	
		FileInputStream m=new FileInputStream("C:\\Selenium Excel Sheet\\ERPTesting.xls");
		Workbook excel=Workbook.getWorkbook(m); //Download and upload "jxl file".
		Sheet sheet=excel.getSheet("Sheet3");
		int rowcount=sheet.getRows();
		int columncount=sheet.getColumns();
		
		String testdata[][]=new String[rowcount-1][columncount-1]; //it is used for create space (4*2 - 4row, 2column) 
		
		for(int i=1; i<rowcount; i++) {    //rowcount=5
			for(int j=1;j<columncount;j++) {  //columncount=3
				testdata[i-1][j-1]=sheet.getCell(j,i).getContents(); //getcell - coulmn-row concept in datadriven
				 //testdata[i-1][j-1] - row-column concept in java
			}
		}
	
		return testdata;
	}
	
	@Test(dataProvider="logindata")
	public void logincheck(String uname,String pwd) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium java\\chrome2\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	      
	      WebElement username=driver.findElement(By.id("txtUsername"));
	      username.sendKeys(uname);
	      
	      WebElement password=driver.findElement(By.id("txtPassword"));
	      password.sendKeys(pwd);
	      
	      WebElement loginbutton=driver.findElement(By.id("btnLogin"));
	      loginbutton.click();
	      
	      driver.quit();
	}
	
}
