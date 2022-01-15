package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_Constants {
	
	public WebDriver driver;
	@BeforeMethod
	public void openAppln(){
		System.setProperty(Gecko_Key, Gecko_Value);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterMethod
	public void closeAppln(ITestResult res) throws IOException{
		
		if(ITestResult.FAILURE==res.getStatus()){
			Generic_screenshot.takes(driver);
		}
		
		driver.close();
	}
	
}
