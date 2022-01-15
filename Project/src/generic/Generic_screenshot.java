package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_screenshot {
	
	public static void takes(WebDriver driver) throws IOException{
		
		String path="./photos/";
		Date date=new Date();
		String dateValue=date.toString();
		String currentDate=dateValue.replaceAll(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File hdd=new File(path+currentDate+".jpeg");
		
		FileUtils.copyFile(temp, hdd);
		
	}

}
