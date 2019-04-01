package assignment_date23_03_19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment16 extends BaseClassChrome {

	public static void main(String[] args) throws Exception {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
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
		WebDriverWait wait =new WebDriverWait(driver, 15);
		driver.findElement(By.xpath("//input[@id='contactNumber']")).sendKeys("8318766877");
		WebElement fname = driver.findElement(By.xpath("//input[@id='fullname']"));
		fname.clear();
		fname.sendKeys("Abhishek Shukla");
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.clear();
		address.sendKeys("Bangalore, India");
		driver.findElement(By.xpath("//input[@id='postcode_delivery']")).sendKeys("560035");		
		WebElement pan = driver.findElement(By.xpath("//input[@id='panNumberInput']"));
		pan.clear();
		pan.sendKeys("DMQPS0725Z");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@id='nomineeName']")).sendKeys("Abc Xyz");
		WebElement nominee = driver.findElement(By.xpath("//select[@name='nomineeRelationship']"));
		Select s1=new Select(nominee);
		s1.selectByVisibleText("Father");
		WebElement nomineeNationality = driver.findElement(By.xpath("//select[@name='nomineeNationality']"));
		Select s2=new Select(nomineeNationality);
		s2.selectByVisibleText("Indian");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		wait.until(ExpectedConditions.titleIs("Gold Mine Payment Option | BlueStone.com"));
		Assert.assertEquals(driver.getTitle(), "Gold Mine Payment Option | BlueStone.com");
		System.out.println("Assertion is Passed");
		driver.close();
	}
}
