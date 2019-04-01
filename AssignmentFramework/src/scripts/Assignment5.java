package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment5 extends BaseClassChrome {

	@Test
	public static void scenario5() throws Exception {
		driver.get("https://www.bluestone.com");		
		WebElement goldCoins = driver.findElement(By.xpath("//li[@id='goldCoins']/descendant::a[@title='Gold Coins']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(goldCoins).perform();
		WebElement oneGm = driver.findElement(By.xpath("//li[@id='goldCoins']/descendant::span[text()='Lakshmi Gold Coins']/parent::div/following-sibling::ul/descendant::span[text()='10 gram']"));
		oneGm.click();
		Thread.sleep(3000);
		WebElement txt = driver.findElement(By.xpath("//h1[text()='10 gram 24 KT Lakshmi Gold Coin']"));
		String actual = txt.getText();
		//System.out.println("Coin details : "+actual);
		Reporter.log("Coin details : "+actual, true);
		String expected="10 gram 24 KT Lakshmi Gold Coin";
		Assert.assertEquals(actual, expected);
		//System.out.println("Assertion Passed");
		Reporter.log("Assertion Passed", true);
	}

}
