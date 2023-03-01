package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commom.com.BeforeMethods;
import commom.com.BeforeMethodsTwo;

public class TestR9 extends BeforeMethodsTwo{

ChromeDriver driver ;
	
	@DataProvider(name="LoginCredntials")
	public Object[][] dataset2(){
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
		} ;
		
	}
	
	@Test(dataProvider ="LoginCredntials") 
	// Instead method name , we can pass value of name attribute in dataProviders
	
	public void Login(String username , String password) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.cssSelector("#login-button")).click();
		
		
		// close the browser
		driver.quit();
		
	}
	
	
	
	
}

