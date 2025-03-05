package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
	public static WebDriver driver;
	public Properties prop; 
	
		@SuppressWarnings({ "deprecation", "unused" })
		public WebDriver initializeDriver() throws IOException {
		Properties prop =new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\abdal\\New folder\\Task\\src\\main\\java\\resources\\data.properties");
		prop.load(fs);	
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdal\\Documents\\Selenium Webdrivers\\chromedriver-win64\\chromedriver.exe");
			@SuppressWarnings("unused")
			WebDriver driver= new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\abdal\\Documents\\Selenium Webdrivers\\geckodriverWin.exe");
			WebDriver driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://dubarter.com/en");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		return driver;
		
		
	}
}