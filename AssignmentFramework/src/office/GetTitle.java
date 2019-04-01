package office;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.airasia.com/");
	WebElement ele = driver.findElement(By.tagName("title"));
	String title = ele.getAttribute("textContent");
	System.out.println(title);
	
	}

}
