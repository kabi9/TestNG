package commom.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeMethods {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class Method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test Method");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After test Method");
	}
	
	@BeforeSuite
	public void beforeEvertSuite() {
		System.out.println("BeforeEvery Suite");
	}
	
	@AfterSuite
	public void afterEvertSuite() {
		System.out.println("After Every Suite");
	}
}
