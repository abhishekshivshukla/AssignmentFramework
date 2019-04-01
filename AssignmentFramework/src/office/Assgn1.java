package office;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shiv/Desktop/Office/text_box.html");
		WebElement id = driver.findElement(By.id("id123"));
		String value = id.getAttribute("value");
		driver.findElement(By.id("id234")).sendKeys(value);
		
		
	}

}
