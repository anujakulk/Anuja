package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CaptureScreen
{
	
	public static void printScreen(WebDriver driver, String fileName) throws IOException
	{
		// screenshot
		TakesScreenshot screen = (TakesScreenshot) driver; 					// typecsting
		File screenShot = screen.getScreenshotAs(OutputType.FILE); // taking screenshot
		File path = new File("C:\\Users\\ART24\\Capture"+fileName+".png");
		Files.copy(screenShot, path);
	}
	
	

}