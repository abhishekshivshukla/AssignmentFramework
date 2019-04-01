package assignment_date23_03_19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Assignment10 extends BaseClassChrome {

	public static void main(String[] args) throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//input[@type='text'][@name='search_query']")).sendKeys("Rings"+Keys.ENTER);
		WebElement gender = driver.findElement(By.xpath("//span[text()='Gender']"));
		//Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac.moveToElement(gender).perform();
		Thread.sleep(3000);
		WebElement women = driver.findElement(By.xpath("//span[@class='prcs-dlh'][@data-displayname='women']"));
		System.out.println("Women count : "+women.getText());
		driver.close();
	}
}
