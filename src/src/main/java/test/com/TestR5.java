package test.com;

import org.testng.annotations.Test;

import commom.com.BeforeMethods;

@Test (groups = "userRegistration")			//	GROUPING AT CLASS LEVEL
public class TestR5 extends BeforeMethods{


	// feature testcase (login)
	// smoke test / sanity testcase
	// regression testcases

	@Test(priority = 1, description = "This is login testcase",groups = "loginF")	//	GROUPING AT TEST LEVEL
	public void loginTest() {
		System.out.println("Login successful");
	}

	@Test(priority = 2, description = "This is logout testcase",groups = {"loginF","regression"})
	public void logOut() {
		System.out.println("Logout Successful");
	}

	@Test(priority = 3, description = "This is added to card testcase" ,groups = "addC")
	public void addTOCart1() {
		System.out.println("Adding to cart 1");
	}

	@Test(priority = 4, description = "This is added to card testcase",groups = {"addC","regression"})
	public void addTOCart2() {
		System.out.println("Adding to cart 2");
	}

	@Test(priority = 5, description = "This is added to card testcase",groups = "addC")
	public void addTOCart3() {
		System.out.println("Adding to cart 3");
	}

	
	
	
}

