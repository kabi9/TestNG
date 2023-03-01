package test.com;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commom.com.BeforeMethods;
import commom.com.BeforeMethodsTwo;

public class testR11 extends BeforeMethodsTwo {
	
	//	******* Doing screenshot *********

	ChromeDriver driver;

	@Test
		public void Login() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();

		//	UUID uuid = UUID.randomUUID();
		
		Date currentDate = new Date();
		String currentDateS = currentDate.toString().replace(" ","-").replace(":","-");
		
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SourceFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		//File DestFile = new File(".//screenshot//screenshotB"+uuid+".png");
		
		File DestFile = new File(".//screenshot//screenshotB"+currentDateS+".png");
		FileUtils.copyFile(SourceFile, DestFile);

		driver.quit();

	}

}
