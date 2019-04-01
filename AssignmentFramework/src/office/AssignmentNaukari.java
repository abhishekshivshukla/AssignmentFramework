package office;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentNaukari {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.naukri.com");
		String parentWH = driver.getWindowHandle();
		
		Set<String> allWH = driver.getWindowHandles();
		String parentTitle = driver.switchTo().window(parentWH).getTitle();
		
		ArrayList<String> arrList=new ArrayList<String>(allWH);	
		System.out.println(arrList);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(parentTitle));
		
		for(int i=arrList.size()-1;i>=0; i--)
		{
			
			driver.switchTo().window(arrList.get(i));
			String title = driver.getTitle();
			System.out.println(title);
			//driver.close();
		}
		
		for(int i=0; i<arrList.size();i ++)
		{
			if(i%2==0)
			{
				driver.switchTo().window(arrList.get(i));
				String title = driver.getTitle();
				System.out.println(title);
				driver.close();
			}
			Thread.sleep(2000);
		}
			
			for(int  i=0; i<arrList.size();i ++)
			{
				if(i%2!=0)
				{
					driver.switchTo().window(arrList.get(i));
					String title = driver.getTitle();
					System.out.println(title);
					driver.close();
				}
		}
	}

}
