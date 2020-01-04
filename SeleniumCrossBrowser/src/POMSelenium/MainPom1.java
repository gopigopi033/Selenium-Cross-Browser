package POMSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;

public class MainPom1 {

	public static void main(String args[]) throws BiffException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		SubPom1.username(driver).sendKeys("sylix");
		SubPom1.password(driver).sendKeys("admin");
		SubPom1.login(driver).click();
		
		
}}
