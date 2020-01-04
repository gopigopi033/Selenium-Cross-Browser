package POMSelenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import jxl.read.biff.BiffException;

public class MainPom2 {
	public static void main(String args[]) throws BiffException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, SubPom2.class);
		
		SubPom2.username.sendKeys("sylix");
		SubPom2.password.sendKeys("admin");
		SubPom2.login.click();

}}
