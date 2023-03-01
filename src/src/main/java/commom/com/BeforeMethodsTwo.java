package commom.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeMethodsTwo {

	@BeforeSuite
	public void Bsuite() {
		System.out.println("I will be executed first");
	}
	@AfterSuite
	public void Asuite() {
		System.out.println("I will be executed last");
	}
	
	@BeforeTest
	public void Btest() {
		System.out.println("I will be executed before  any class execute");
	}
	
	@AfterTest
	public void Atest() {
		System.out.println("I will be executed after all classes are execute");
	}
	
	
	@BeforeClass
	public void BClass() {
		System.out.println("I will be excuted before the class");
	}
	
	@AfterClass
	public void AClass() {
		System.out.println("I will be excuted after the class");
	}
	
}
