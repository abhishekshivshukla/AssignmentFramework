package office;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class UlValidations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		String mainMenuXp = "//div[@id='topnav_wrapper']/ul/li/span";
		List<WebElement> mainMenu = driver.findElements(By.xpath(mainMenuXp));
		Actions a = new Actions(driver);
		
		/*Object [] expected=new Object[mainMenu.size()];//= {"Living","Bedroom","Dining","Storage","Study","Mattresses","Decor","New","Collections"};
		Object[] actual=new Object[mainMenu.size()];*/
		
		List<String> actual=new ArrayList<>();
		List<String> expected=new ArrayList<>();
		for (int i = 0; i < mainMenu.size(); i++) {
			Thread.sleep(2000);
			a.moveToElement(mainMenu.get(i)).perform();
			String menu = mainMenu.get(i).getText();
			actual.add(menu);
			expected.add(menu);
			/*actual[i]=menu;
			expected[i]=menu;*/
			
			
			//System.out.println("Menu option " + i + " : " + menu);

			String headMenuXp = "//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(text(),\""
					+ menu + "\")]/following-sibling::div/descendant::div[@class='taxontype']/a";
			List<WebElement> headMenu = driver.findElements(By.xpath(headMenuXp));

			for (int j = 0; j < headMenu.size(); j++) {
				Thread.sleep(1000);
				String headMenuText = headMenu.get(j).getText();
				actual.add(headMenuText);
				expected.add(headMenuText);
				//System.out.println("Head Menu : " + headMenuText);

				String subMenuXp = "//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(text(),\""
						+ menu + "\")]/following-sibling::div/descendant::div[@class='taxontype']/a[.=\"" + headMenuText
						+ "\"]/parent::div/following-sibling::ul[@class='taxonslist']/li/a/span";
				List<WebElement> subMenu = driver.findElements(By.xpath(subMenuXp));

				for (int k = 0; k < subMenu.size(); k++) {
					String subMenuText = subMenu.get(k).getText();
					//System.out.println("Sub Menu : " + subMenuText);
					actual.add(subMenuText);
					expected.add(subMenuText);
				}
			}
		}
		System.out.println("Actual : "+actual);
		System.out.println("Expected : "+expected);
		Assert.assertEquals(actual, expected);
	}
}
	
