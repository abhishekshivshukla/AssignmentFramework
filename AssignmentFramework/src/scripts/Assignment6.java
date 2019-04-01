package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment6 extends BaseClassChrome {

	@Test
	public static void scenario6() throws Exception {
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//input[@type='text'][@name='search_query']")).sendKeys("Rings"+Keys.ENTER);
		WebElement priceList = driver.findElement(By.xpath("//span[text()='Price']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(priceList).perform();
		WebElement range = driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']"));
		ac.moveToElement(range);
		String items = driver.findElement(By.xpath("//span[text()=' 10,000 ']/descendant::span[@class='items-count']")).getText();
		//System.out.println("Number of rings below Rs 10000 are : "+items);
		Reporter.log("Number of rings below Rs 10000 are : "+items, true);
	}

}
