package test.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commom.com.BeforeMethods;
import commom.com.BeforeMethodsTwo;

public class TestR7 extends BeforeMethodsTwo {

	@BeforeMethod
	public void BMethod() {
		System.out.println("I will be executed before every Testcase");
	}

	@AfterMethod
	public void AMethod() {
		System.out.println("I will be executed after every Testcase");
	}

	@Test
	public void TestOne() {
		System.out.println("Test one executed");
	}

	@Test
	public void TestTwo() {
		System.out.println("Test two executed");
	}

	@Test
	public void TestThree() {
		System.out.println("Test three executed");
	}

}
