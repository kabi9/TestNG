package test.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commom.com.BeforeMethods;
import commom.com.BeforeMethodsTwo;

public class TestR8 extends BeforeMethodsTwo{
	
	@DataProvider(name ="loginCredentials")
	
	public Object[][] dataset() {
		
		Object[][]  dataset = new Object[4][2];		//	PASS RETURN MULTIDIMENSIONAL OBJECT
		
		dataset[0][0] = "user1";
		dataset[0][1] = "pwd1";
		
		dataset[1][0] = "user2";
		dataset[1][1] = "pwd2";
		
		dataset[2][0] = "user3";
		dataset[2][1] = "pwd3";
		
		dataset[3][0] = "user4";
		dataset[3][1] = "pwd4";
		
		return dataset;					//		SHOULD RETURN DATASET
		
	}

	//		********	BETTER WAY FOR DATAPROVIDER	****************
	
	@DataProvider(name = "data")
	
	public Object[][] dataset2(){
		return new Object[][] {
			{"user1","pwd1"},
			{"user2","pwd2"},
			{"user3","pwd3"},
			{"user4","pwd4"}
			
		} ;
		
	}
	
	
	
	@Test(dataProvider = "data") 
	// Instead method name , we can pass value of name attribute in dataProviders
	
	public void Login(String username , String password) {
		System.out.println(username + password);
	}
	
	
	
	
	
}

