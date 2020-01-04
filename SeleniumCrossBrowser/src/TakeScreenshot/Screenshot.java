package TakeScreenshot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshot {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium java\\chrome2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//1. Teake full screeshot using Robotclass: (it run successfully)
		Robot robot=new Robot();
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screensize);
		BufferedImage source=robot.createScreenCapture(rectangle);
		File destination=new File("E:\\takescreenshot\\rect.jpg");
		ImageIO.write(source, "jpg", destination);
		
		//2. Take Full screenshot using Ashot API: (Still now it cannot run)
//		WebElement element=driver.findElement(By.id("fakebox-input"));
//		ru.yandex.qatools.ashot.Screenshot Screenshot = new AShot().takeScreenshot(driver);
//		Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver, element);
//		ImageIO.write(Screenshot.getImage(), "jpg", new File ("E:\\takescreenshot\\rectashot.jpg"));
//		
		
		
	}

}
