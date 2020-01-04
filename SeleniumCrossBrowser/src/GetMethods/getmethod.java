package GetMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium java\\chrome\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      //1. get()
	      driver.get("https://in.ebay.com"); //Launch url
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      WebElement b=driver.findElement(By.xpath("//input[@type='text']"));
	      b.click();
	      
	      //2. getclass()
	      //a.getClass();
	      //System.out.println(a);
	      //System.out.println(b.getClass());  // To print class
	      
	      //3. getAttribute() 
	      //String g = b.getAttribute("class");
	      //System.out.println(g);
	      //System.out.println(b.getAttribute("class")); //it used to print classname, id, 
	                                                     //type which one you want print in console window use this. 
	    
	      //4. getCurrentUrl()
	      //String url=driver.getCurrentUrl();
	      //System.out.println(url);
	      //System.out.println(driver.getCurrentUrl()); //it is used for print or get current URL.
	      
	      //5. getPageSource()
	      //String pagesource=driver.getPageSource();
	      //System.out.println(pagesource);
	      //System.out.println(driver.getPageSource()); //it is used get current page source
	      
	      //6. getTitle()
	      //String title=driver.getTitle();
	      //System.out.println(title);  //it is used to get title of the current webpage
	      //System.out.println(driver.getTitle());
	      
	      //7. getText()
	      //WebElement t=driver.findElement(By.xpath("//div[@style='color:#07522C;' and @class='ebayui-ellipsis-3']"));
	      //String text=t.getText();
	      //System.out.println(text);  //it is used get text the particular element
	      //System.out.println(t.getText());
	      
	      //8. getTagName()
	      //String tag=b.getTagName();
	      //System.out.println(tag);
	      //System.out.println(b.getTagName()); //it is used get current path tagname
	      
	      //9. getWindowHandle() and getWindowHandles()
	      //getWindowHandle - is used for handle only single window
	      //((JavascriptExecutor)driver).executeScript("window.open()"); //it is used for open new window.
	      //driver.get("http://www.google.com"); //here you cannot open url in current window suppose use here open for 1 window.
	      //List<String> handles=new ArrayList<String>(driver.getWindowHandles()); //it get how many windows opened count and details
	      //driver.switchTo().window(handles.get(1)); //it is used switch one window to another window using index 0,1,2
	      //driver.get("http://www.google.com"); // here you can open url current window.
	      //System.out.println(handles.size()); //it used print how many windows are opened in length format 1,2,3
	      //driver.switchTo().window(handles.get(0)); //go to 0th that mean first window.
	      
	      
	     // driver.close();
	}

}
