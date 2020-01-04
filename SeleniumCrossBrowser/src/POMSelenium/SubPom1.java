package POMSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubPom1 {
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("txt_unam"));
		
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("txt_pass"));
		
	}
	public static WebElement login(WebDriver driver) {
		return driver.findElement(By.id("Button3"));
		
	}
}
