package POMSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPom3 {
	
	public static WebElement txt_unam; //this method only used "name" and "id" otherwise xpath,csselector cannot use.
	public static WebElement txt_pass;
	public static WebElement Button3;
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, MainPom3.class);
		
		txt_unam.sendKeys("sylix");
		txt_pass.sendKeys("admin");
		Button3.click();

}}
