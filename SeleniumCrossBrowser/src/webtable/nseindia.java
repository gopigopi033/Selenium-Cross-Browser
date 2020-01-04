package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nseindia {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium java\\chrome2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
		WebElement yes = driver.findElement(By.xpath("//ul[@class='topTab']/li[@class='last']"));
		//yes.click();
		//Actions actions = new Actions(driver);
		//actions.moveToElement(yes).click().build().perform();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", yes);
		List<WebElement> columns=driver.findElements(By.tagName("td"));
		int columncount=columns.size();
		System.out.println(columncount);
		//a[text()='YESBANK'][1]
		//a[text()='YESBANK'][2]
		WebElement getpercent=driver.findElement(By.xpath("//td[text()='Value']/following::td[5]/following::a[2]"));
		String percent=getpercent.getText();
		
		System.out.println(percent);
		
		
		//driver.quit();
	}

}
