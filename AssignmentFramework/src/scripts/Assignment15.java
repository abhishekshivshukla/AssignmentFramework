package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment15 extends BaseClassChrome {

	@Test
	public static void scenario15() throws Exception {
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
				//System.out.println("Error message is displayed and the message is : "+msg.getText());
				Reporter.log("Error message is displayed and the message is : "+msg.getText(), true);
			}
			else
				//System.out.println("Error message is not being displayed");
				Reporter.log("Error message is not being displayed", true);
		}
		Thread.sleep(3000);
	}
}
