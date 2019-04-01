package office;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LinksValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shiv/Desktop/Office/links.html");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkNum = links.size();
		Assert.assertEquals(linkNum, 5);
	}

}
