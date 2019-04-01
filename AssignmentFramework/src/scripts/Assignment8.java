package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment8 extends BaseClassChrome {

	@Test
	public static void scenario8() throws Exception {
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//input[@type='text'][@name='search_query']")).sendKeys("Rings"+Keys.ENTER);
		WebElement metal = driver.findElement(By.xpath("//span[text()='Metal']"));
		Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac.moveToElement(metal).perform();
		Thread.sleep(3000);
		WebElement range = driver.findElement(By.xpath("//span[@data-displayname='platinum']"));
		ac.moveToElement(range);
		String items = driver.findElement(By.xpath("//span[text()=' Platinum ']/descendant::span[@class='items-count']")).getText();
		//System.out.println("Platinum Rings : "+items);
		Reporter.log("Platinum Rings : "+items, true);
	}

}
