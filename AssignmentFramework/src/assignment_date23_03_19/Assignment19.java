package assignment_date23_03_19;

/*import java.util.HashMap;
import java.util.Map;*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment19{

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com");
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).click();
		/*Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("BLR");*/
	}

}
