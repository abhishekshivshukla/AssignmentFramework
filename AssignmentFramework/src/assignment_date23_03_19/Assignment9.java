package assignment_date23_03_19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Assignment9 extends BaseClassChrome {

	public static void main(String[] args) throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//input[@type='text'][@name='search_query']")).sendKeys("Rings"+Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='More Filters']")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[@class='prcs-dlh'][@data-displayname='22k']"));
		System.out.println("gold coin : "+element.getText());
	}
}
