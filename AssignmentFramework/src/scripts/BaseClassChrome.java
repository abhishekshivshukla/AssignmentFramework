package scripts;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseClassChrome 
{
	static
	{		
// Set the path driver executable
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}	
// Launch the browser
	
	static WebDriver driver;
	@BeforeMethod
	public void openApplication()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void closeApplication(ITestResult res) throws Exception
	{
		/*if(ITestResult.FAILURE==res.getStatus())
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			Date d=new Date();
			String date = d.toString().replaceAll(":", "_");
			File scrFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./screenshots/"+res.getName()+date+".png");
			Files.copy(scrFile, destFile);
		}*/
		
		if(ITestResult.SUCCESS==res.getStatus())
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			Date d=new Date();
			String date = d.toString().replaceAll(":", "_");
			File scrFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./screenshots/"+res.getName()+date+".png");
			Files.copy(scrFile, destFile);
		}
		driver.close();
	}		
}