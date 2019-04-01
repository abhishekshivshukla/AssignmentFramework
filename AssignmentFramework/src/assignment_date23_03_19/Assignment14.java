package assignment_date23_03_19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assignment14 extends BaseClassChrome {

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//a[text()='10+1 Monthly Scheme ']")).click();
		WebElement scroll = driver.findElement(By.xpath("//div[@class='goldmine-banner']"));
		int x = scroll.getLocation().getX();
		int y = scroll.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+", "+y+")");
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("100000");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("qateam.abhishek@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit'][@value='Start Now']")).click();
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		String actualEmail = email.getAttribute("value");
		WebElement amount = driver.findElement(By.xpath("//span[text()=' 1,00,000']"));
		String actualAmount = amount.getText();
		Assert.assertEquals(actualEmail, "qateam.abhishek@gmail.com");
		System.out.println("Assertion for email id is Passed");
		Assert.assertEquals(actualAmount, "Rs 1,00,000");
		System.out.println("Assertion for Amount is Passed");
		driver.close();
	}

}
