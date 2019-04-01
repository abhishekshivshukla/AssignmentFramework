package assignment_date23_03_19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Assignment8 extends BaseClassChrome {

	public static void main(String[] args) throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//input[@type='text'][@name='search_query']")).sendKeys("Rings"+Keys.ENTER);
		WebElement metal = driver.findElement(By.xpath("//span[text()='Metal']"));
		Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac.moveToElement(metal).perform();
		Thread.sleep(3000);
		WebElement range = driver.findElement(By.xpath("//span[@data-displayname='platinum']"));
		ac.moveToElement(range);
		String items = driver.findElement(By.xpath("//span[@data-displayname='platinum']/span[text()='(47)']")).getText();
		System.out.println("Platinum Rings : "+items);
		driver.close();
	}

}
