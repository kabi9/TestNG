package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commom.com.BeforeMethodsTwo;

public class testR10 extends BeforeMethodsTwo{
	
	// Webdriver interface  // method definition
	
	// Chrome people
	// Firefox people
	// Edge people
	
	ChromeDriver driver ;
	@Parameters({"username","password","browser"})
	
	@Test
	public void Login(String username , String password,String browser) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			//
		}
		else if(browser.equals("edge")) {
			//
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.cssSelector("#login-button")).click();
		driver.quit();
		
	}
	
		
	
	
}

