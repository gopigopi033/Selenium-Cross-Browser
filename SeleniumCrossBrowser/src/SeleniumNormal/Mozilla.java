package SeleniumNormal;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilla {
	
	public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://facebook.in");
		}

	}


