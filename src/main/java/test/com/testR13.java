package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commom.com.BaseTest;
import commom.com.BeforeMethodsTwo;

public class testR13 extends BaseTest{
	@Test
	public void Login(){
		
		//	**	WE GET DRIVER REFRENCE FROM BASETEST public static WebDriver driver = null; **
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		Assert.assertEquals(false, true);	//	DELIBERATELY FAILING TESTCASE
	}
	
}

