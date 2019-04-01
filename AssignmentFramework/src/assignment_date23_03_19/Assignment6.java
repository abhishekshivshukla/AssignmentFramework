package assignment_date23_03_19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Assignment6 extends BaseClassChrome {

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//input[@type='text'][@name='search_query']")).sendKeys("Rings"+Keys.ENTER);
		WebElement priceList = driver.findElement(By.xpath("//span[text()='Price']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(priceList).perform();
		WebElement range = driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']"));
		ac.moveToElement(range);
		String items = driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']/span[text()='(44)']")).getText();
		System.out.println("Number of rings below Rs 10000 are : "+items);
		driver.close();
	}

}
