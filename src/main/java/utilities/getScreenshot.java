package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import commom.com.BaseTest;

public class getScreenshot extends BaseTest {

	public static void getScreenS() {

		Date currentDate = new Date();
		String currentDateS = currentDate.toString().replace(" ", "-").replace(":", "-");
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SourceFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(".//screenshort//screenshortB" + currentDateS + ".png");

		try {
			FileUtils.copyFile(SourceFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
