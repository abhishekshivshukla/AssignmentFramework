package assignment_date23_03_19;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Assignment11 extends BaseClassChrome {

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		WebElement scroll = driver.findElement(By.xpath("//div[text()='Why BlueStone']"));
		int x = scroll.getLocation().getX();
		int y = scroll.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		WebElement mainMenu = driver.findElement(By.xpath("//ul[@class='wh-main-menu']"));
		if(mainMenu.isDisplayed())
			System.out.println("Main menu is being displayed");	
		else
		{
			System.out.println("Main menu is NOT being displayed");
			System.exit(0);
		}
		System.out.println();
		List<WebElement> menuItems = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		for(WebElement menu : menuItems)
		{
			String menutext = menu.getText();
			System.out.println(menutext);
		}
		driver.close();
	}
}
