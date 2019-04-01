package office;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassChrome 
{
	static
	{		
// Set the path driver executable
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}	
// Launch the browser
	
	    static WebDriver driver=new ChromeDriver();
}