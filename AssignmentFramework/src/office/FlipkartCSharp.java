package office;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartCSharp {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class= '_2AkmmA _29YdH8']")).click();
		driver.findElement(By.name("q")).sendKeys("Let Us C#");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		WebElement priceLtoH = driver.findElement(By.xpath("//div[contains(text(),'Low to High')]"));
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(priceLtoH));
		Thread.sleep(3000);
		priceLtoH.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Let Us C#']")).click();
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		for(String wh: windowHandles)
		{
			driver.switchTo().window(wh);
		}
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK'][text()='ADD TO CART']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Place Order']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9532116688");
		Thread.sleep(200);
		driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("adfg");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
