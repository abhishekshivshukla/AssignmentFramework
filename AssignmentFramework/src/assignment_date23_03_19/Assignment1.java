package assignment_date23_03_19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Assignment1 extends BaseClassChrome {

	public static void main(String[] args) throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");		
		WebElement goldCoins = driver.findElement(By.xpath("//li[@id='goldCoins']/descendant::a[@title='Gold Coins']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(goldCoins).perform();
		WebElement oneGm = driver.findElement(By.xpath("//li[@id='goldCoins']/descendant::span[text()='Plain Gold Coins']/parent::div/following-sibling::ul/descendant::span[text()='20 gram']"));
		oneGm.click();
		Thread.sleep(3000);
		WebElement txt = driver.findElement(By.xpath("//h1[text()='20 gram 24 KT Gold Coin']"));
		String actual = txt.getText();
		System.out.println("Coin details : "+actual);
		String expected="20 gram 24 KT Gold Coin";
		Assert.assertEquals(actual, expected);
		System.out.println("Assertion Passed");
		driver.close();
	}

}
