package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment10 extends BaseClassChrome {

	@Test
	public static void scenario10() throws Exception {
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//input[@type='text'][@name='search_query']")).sendKeys("Rings"+Keys.ENTER);
		WebElement gender = driver.findElement(By.xpath("//span[text()='Gender']"));
		//Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac.moveToElement(gender).perform();
		Thread.sleep(3000);
		WebElement women = driver.findElement(By.xpath("//span[@class='prcs-dlh'][@data-displayname='women']"));
		//System.out.println("Women count : "+women.getText());
		Reporter.log("Women count : "+women.getText(), true);
	}
}
