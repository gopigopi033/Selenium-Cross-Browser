package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iphone {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium java\\chrome2\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.get("https://www.greenstechnologys.com/");
	      driver.manage().window().maximize(); //It is used for to maximize the window
	      Actions d=new Actions(driver);
	      WebElement link=driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[6]/a"));
	      d.contextClick(link).perform();
	      Robot robo=new Robot();
	      robo.keyPress(KeyEvent.VK_DOWN);
	      robo.keyRelease(KeyEvent.VK_DOWN);
	      robo.keyPress(KeyEvent.VK_DOWN);
	      robo.keyRelease(KeyEvent.VK_DOWN);
	      robo.keyPress(KeyEvent.VK_ENTER);
	      robo.keyRelease(KeyEvent.VK_ENTER);
	}}
