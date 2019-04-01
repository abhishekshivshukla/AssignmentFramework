package assignment_date23_03_19;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment17 extends BaseClassChrome {

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//a[text()='Visit Our Stores']")).click();
		List<WebElement> storeList = driver.findElements(By.xpath("//div[@class='store-location']"));
		System.out.println("Total number of stores : "+storeList.size());
		for(int i=0; i<storeList.size(); i++)
		{
			String storeLocation = storeList.get(i).getText();
			System.out.println("Store location "+(i+1)+" : "+storeLocation);
		}
		driver.close();
	}
}
