package javascriptexecutor;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScript {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium java\\chrome\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com"); 
		//driver.findElement(By.name("username")).sendKeys("naveenk");
				//driver.findElement(By.name("password")).sendKeys("test@1234");
				//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		//1. ExecuteScript:
		//1.1 click method for executescript one way:
		WebElement click=driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].click();", click);
		//1.2 second way:
    	//WebElement click=driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();",click);
    	
		//2. ExecuteAsynScript:
    	//2.1 click method for executeasynscript one way:
    	//WebElement click1=driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a"));
		//JavascriptExecutor js1 = ((JavascriptExecutor) driver);
    	//js1.executeAsyncScript("arguments[0].click();", click1);
    	//2.2 second way
    	//WebElement click1=driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a"));
    	//((JavascriptExecutor)driver).executeAsyncScript("arguments[0].click();",click1);
    	
    //************* JavaScriptExecutor All Methods Syntax*****************//
    	
    	/* 
    	   import org.openqa.selenium.JavascriptExecutor;
    		import org.openqa.selenium.JavascriptExecutor;
    		
    		Syntax:

    		JavascriptExecutor js = (JavascriptExecutor) driver;  
    		js.executeScript(Script,Arguments);
    		
    		Script – The JavaScript to execute
    		Arguments –The arguments to the script(Optional). May be empty.
    		Returns –One of Boolean, Long, String, List, WebElement, or null.


    		Let’s see some scenarios we could handle using this Interface:

    		1. SendKeys() method:
    		js.executeScript("document.getElementById('some id').value='text';");
    		                         (or)
    		js.executeScript("arguments[0].value='text';");
    		
    		2. Click a Button:
    		js.executeScript("document.getElementById('enter your element id').click();");
    		                     (or)
    		js.executeScript("arguments[0].click();", loginButton);
    		
    		3. To handle Checkbox:
    		js.executeScript("document.getElementById('enter element id').checked=false;");
    		
    		4. Generate Alert Popup Message:
    		js.executeScript("alert('Welcome To SoftwareTestingMaterial');");
    		
    		5. To refresh browser:
    		js.executeScript("history.go(0)");
    		            (or)
    		js.executeScript("Location.reload()");            
    		
    		6. To get innertext of the entire webpage:
    		//Inner text mean inside the web page all text should display in console window:
    		String sText =  js.executeScript("return document.documentElement.innerText;").toString();
    		System.out.println(sText);
                                (or)
            System.out.println(getPageInnerText(driver));                        		
    		
    		
    		7. To get Title of our webpage:
    		String sText =  js.executeScript("return document.title;").toString();
    		System.out.println(sText);
    		
    		8. To get domain name:
    		String sText =  js.executeScript("return document.domain;").toString();
    		System.out.println(sText);
    		
    		9. To get URL of a webpage:
    		String sText =  js.executeScript("return document.URL;").toString();
    		System.out.println(sText);
    		
    		10. Scroll Options:
    		//10.1 Vertical scroll - down and Up
    		js.executeScript("window.scrollBy(0,500)");
    		js.executeScript("window.scrollBy(0,-500)");
    		
    		//10.2 Vertical Scrolling Bottom and Top of the webpage:
    		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    		                     (or)
    		js.executeScript("window.scrollBy(0,0)");
    		
    		//10.3 Particular element place scroll:
    		js.executeScript("arguments[0].scrollIntoview(true);",element);
    	
    		11. To click on a SubMenu which is only visible on mouse hover on Menu
    		js.executeScript("$('ul.menus.menu-secondary.sf-js-enabled.sub-menu li').hover()");
    		
    		12. To navigate to different page using Javascript
    		js.executeScript("window.location = 'https://www.softwaretestingmaterial.com");
    		
    		13. To find hidden element in selenium using JavaScriptExecutor
    		js.executeScript("arguments[0].click();", element);
    		*/
	}
}
