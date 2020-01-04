package POMSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubPom2 {
	
	@FindBy(id="txt_unam")
	public static WebElement username;
	
	@FindBy(id="txt_pass")
	public static WebElement password;
	
	@FindBy(id="Button3")
	public static WebElement login;
}
