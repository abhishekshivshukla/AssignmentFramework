package assignment_date23_03_19;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Assignment12 extends BaseClassChrome {

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//a[text()='10+1 Monthly Scheme ']")).click();
		WebElement startNow = driver.findElement(By.xpath("//input[@type='submit'][@value='Start Now']"));
		WebElement scroll = driver.findElement(By.xpath("//div[@class='goldmine-banner']"));
		int x = scroll.getLocation().getX();
		int y = scroll.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+", "+y+")");
		startNow.click();
		List<WebElement> errMsgs = driver.findElements(By.xpath("//ul[@class='messages']"));
		for(WebElement msg : errMsgs)
		{
			if(msg.isDisplayed())
			{
				System.out.println("Errer message is displayed and the message is : "+msg.getText());
			}
			else
				System.out.println("Errer message is not being displayed");
		}
		driver.close();
	}
}
