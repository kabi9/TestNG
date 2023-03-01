package test.com;

import org.testng.annotations.Test;

import commom.com.BeforeMethods;

public class TestR1 extends BeforeMethods{

	@Test(priority =1)
	public void loginTest() {
		System.out.println("Login successful");
	}
	
	@Test(priority =2)
	public void logOut() {
		System.out.println("Logout Successful");
	}

	
	@Test(priority =3)
	public void addTOCart() {
		System.out.println("Adding to card");
	}
	
	
	
	
}

