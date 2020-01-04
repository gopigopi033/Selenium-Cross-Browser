package javascriptexecutor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naveenlabjavascriptexecutor {

	public static void main(String[] args) throws IOException{

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium java\\chrome2\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/guru99home/"); //enter URL
		
		//WebElement frame=driver.findElement(By.xpath("//div[@id='primis_container_div']/child::iframe"));
		//driver.switchTo().frame(frame);
		
		WebElement po=driver.findElement(By.xpath("(//div[@class='rt-block'])[15]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		//js.executeScript("window.scrollBy(0,-700)");
		
		//js.executeScript("arguments[0].scrollIntoView();", po);
		
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 
		 js.executeScript("window.scrollTo(0, 0)");
		
		
		
		
		// << ExecuteScript -- to execute JavaScript code >> //
		
		//WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]")); //login button
		
		//1. Flash - highlight the element:
		//flash(loginBtn, driver);
		
		//2. Draw a Border:
		//drawBorder(loginBtn, driver);
		
			}
	
	
//	public static void flash(WebElement element, WebDriver driver) {
//        JavascriptExecutor js = ((JavascriptExecutor) driver);
//        String bgcolor  = element.getCssValue("backgroundColor");
//        for (int i = 0; i <  10; i++) {
//            changeColor("rgb(0,200,0)", element,driver);//1
//            changeColor(bgcolor, element,driver);//2
//        }
//    }
//    public static void changeColor(String color, WebElement element, WebDriver driver) {
//    	JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);
//
//        try {
//            Thread.sleep(20);
//        }  catch (InterruptedException e) {
//        }
//     }
//	
//    public static void drawBorder(WebElement element, WebDriver driver){
//    	JavascriptExecutor js = ((JavascriptExecutor) driver);
//    	js.executeScript("arguments[0].style.border='3px solid red'", element);
//    }
}
