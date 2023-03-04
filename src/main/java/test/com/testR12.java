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
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commom.com.BeforeMethods;
import commom.com.BeforeMethodsTwo;

public class testR12 extends BeforeMethodsTwo {
	
	ChromeDriver driver;
	
	@Test (dependsOnMethods = {"OpenBrowser"})
	public void Login() {
		System.out.println("Logging Into Application");
		//		DELEBRATELY FAILING TESTCASE		(1, 2)
			Assert.assertEquals(1, 1);
	}
	
	@Parameters({"browser"})
	@Test
	public void OpenBrowser(String bName) {
		System.out.println("Opening the browser " +bName );
		
	}
	
	@Parameters({"username","password"})
	@Test (dependsOnMethods = {"Login"})
	public void ValidateDashboard(String un, String pwd) {
		System.out.println("Login with userid " + un);
		System.out.println("Login with password " + pwd);
		System.out.println("Validate Logo on Dashboard");
	}

}
