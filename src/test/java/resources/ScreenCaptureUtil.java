package resources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
 * This java class will handle ScreenShot.
 */
public class ScreenCaptureUtil extends Base{

public static byte[] getByteScreenShot() throws IOException {
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		byte[] fileContent = FileUtils.readFileToByteArray(src);
		return fileContent;
		
	}

}
