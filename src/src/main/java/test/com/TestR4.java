package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commom.com.BeforeMethods;

public class TestR4 extends BeforeMethods{

	ChromeDriver driver;

	@Test
	public void loginTest() {
		
		SoftAssert softassert = new SoftAssert();

		// Arrangement
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();

		// Actions 1
		String title = driver.getTitle();
		String expectedTitle = "WebDriver | Contact Us";
		
		// Assertions 1
		System.out.println("Asserting title");
		softassert.assertEquals(title, expectedTitle,"Title verification failed");

		// Actions 2
		System.out.println("Asserting attribute value");
		String eAvaule = "contactme";
		String actualValue = driver.findElement(By.cssSelector("h2[name='contactme']")).getAttribute("name");

		// Assertions 2
		softassert.assertEquals(eAvaule, actualValue , "attribute verification failed");
		
		System.out.println("Closing browser");
		driver.quit();
		
		softassert.assertAll();			// shows which assertion get failed
	
	
	}
	
}

