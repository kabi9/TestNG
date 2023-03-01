package test.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commom.com.BeforeMethods;

public class TestR2 extends BeforeMethods{

	// @BeforeTest
	// @AfterTest
	// @BeforeMethod
	// @AfterMethod
	// @Test
	// @AfterClass
	// @BeforeClass
	// @AfterSuite
	// @BeforeSuite
	
//	@BeforeTest
//	public void dbConnec(){
//		System.out.println("Db Connection");
//	}
//	
//	@AfterTest
//	public void dbDisconnect(){
//		System.out.println("Db Connection closed");
//	}
//	
	@BeforeMethod
	public void OpenBrowser() {
		System.out.println("Broswer open successfully");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Broswer closed successfully");
	}
	
	@Test(priority =1, description = "This is login testcase")
	public void loginTest() {
		System.out.println("Login successful");
	}
	
	@Test(priority =3 , description = "This is logout testcase")
	public void logOut() {
		System.out.println("Logout Successful");
	}

	@Test(priority =2 , description = "This is added to card testcase")
	public void addTOCart() {
		System.out.println("Adding to card");
	}
	
	
	
	
}

