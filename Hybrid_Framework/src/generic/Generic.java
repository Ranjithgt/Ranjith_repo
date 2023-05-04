package generic;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic implements Framework_constant {
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(gecko_key,gecko_value);
		driver=new FirefoxDriver();
		driver.get(fb_url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeApp(ITestResult res)
	{
		if (ITestResult.FAILURE==res.getStatus())
		{
			Screenshot.getScreenshot(driver);
		}
		driver.close();
	}
}
