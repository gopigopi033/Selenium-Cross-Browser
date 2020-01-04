package SeleniumNormal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium java\\chrome2\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	//      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      
	      //1. One Type of date picker Website:
	      driver.get("https://www.cebupacificair.com");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"flightType\"]/div[2]/label/i")).click();
	      Thread.sleep(1000);
	      WebElement des=driver.findElement(By.xpath("//*[@id=\"FromStation\"]"));
	      des.click();
	      des.sendKeys("chennai", Keys.ENTER);
	      WebElement end=driver.findElement(By.xpath("//*[@id=\"ToStation\"]"));
	      end.click();
	      end.sendKeys("cambodia", Keys.ENTER);
	      //JavascriptExecutor js=(JavascriptExecutor)driver;
	      //js.executeScript("document.getElementById('StartDate').value='2019-12-13'");
	                          //(or)
	      WebElement element=driver.findElement(By.id("StartDate"));
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("arguments[0].value='2019-12-13';",element);
	      
//	      2. second one type of picker website:
	      driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//span[@class='k-link k-link-date']")).click();
	      
	            	}
}
