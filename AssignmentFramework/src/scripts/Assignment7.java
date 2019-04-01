package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment7 extends BaseClassChrome {

	@Test
	public static void scenario7() throws Exception {
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//input[@type='text'][@name='search_query']")).sendKeys("Rings"+Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='More Filters']")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[@class='prcs-dlh'][@data-displayname='next day delivery']"));
		//System.out.println(element.getText());
		Reporter.log(element.getText(), true);
	}
}
