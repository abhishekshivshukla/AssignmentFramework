package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment17 extends BaseClassChrome {

	@Test
	public static void scenario17() throws Exception {
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//a[text()='Visit Our Stores']")).click();
		List<WebElement> storeList = driver.findElements(By.xpath("//div[@class='store-location']"));
		//System.out.println("Total number of stores : "+storeList.size());
		Reporter.log("Total number of stores : "+storeList.size(), true);
		for(int i=0; i<storeList.size(); i++)
		{
			String storeLocation = storeList.get(i).getText();
			//System.out.println("Store location "+(i+1)+" : "+storeLocation);
			Reporter.log("Store location "+(i+1)+" : "+storeLocation, true);
		}
		WebElement element = driver.findElement(By.xpath("//div[text()='New Delhi']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(2000);
	}
}
