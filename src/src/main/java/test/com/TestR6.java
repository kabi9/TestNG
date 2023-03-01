package test.com;

import org.testng.SkipException;
import org.testng.annotations.Test;

import commom.com.BeforeMethods;

public class TestR6 extends BeforeMethods{

boolean database = true;
	
	@Test(enabled = false)						//		ANNOTATION TO SKIP TESTCASE (COMPLETELY DISABLED)
	public void skipTest1() {
		System.out.println("Test case one");
	}
	
	@Test
	public void skipTest2() {
		System.out.println("Test case two");
		throw new SkipException("Skipping the TestCase");		//	SKIP TESTCASE.
	}
	
	@Test
	public void skipTest3() {
		
		if(database) {
			System.out.println("Running testcase THREE ");
		}
		else {
			System.out.println("skiping the testcase as db Connection failed");
			throw new SkipException("Skipping the TestCase");
		}
		
	}
	
	
	
}

