package ObjectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ObjectRepo {

	//static WebDriver driver;
	static Properties prop;
	
	public static void main(String[] args) throws IOException {
	
		prop=new Properties();
		FileInputStream ip = new FileInputStream("C:\\Workspace\\SeleniumCrossBrowser\\src\\ObjectRepository\\config.properties");
		prop.load(ip);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
	}
	

}
