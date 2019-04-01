package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment11 extends BaseClassChrome {

	@Test
	public static void scenario11() throws Exception {
		driver.get("https://www.bluestone.com");
		WebElement scroll = driver.findElement(By.xpath("//div[text()='Why BlueStone']"));
		int x = scroll.getLocation().getX();
		int y = scroll.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		WebElement mainMenu = driver.findElement(By.xpath("//ul[@class='wh-main-menu']"));
		if(mainMenu.isDisplayed())
			//System.out.println("Main menu is being displayed");
			Reporter.log("Main menu is being displayed", true);
		else
		{
			//System.out.println("Main menu is NOT being displayed");
			Reporter.log("Main menu is NOT being displayed", true);
			System.exit(0);
		}
		System.out.println();
		List<WebElement> menuItems = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		for(WebElement menu : menuItems)
		{
			String menutext = menu.getText();
			//System.out.println(menutext);
			Reporter.log(menutext, true);
			
		}
	}
}
