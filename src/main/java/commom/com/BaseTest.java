package commom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver = null;		//	USE DRIVER REFRENCE ON ALL TEST CASES.
	
	@BeforeSuite
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}
	
}
