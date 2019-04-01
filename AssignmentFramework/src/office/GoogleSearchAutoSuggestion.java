package office;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchAutoSuggestion extends BaseClassChrome {

	public static void main(String[] args) {
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.switchTo().activeElement().sendKeys("Ambika");
		List<WebElement> suggestionList = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println("Total number of suggestions : "+suggestionList.size());
		for(int i=0; i<suggestionList.size(); i++)
		{
			String suggestion = suggestionList.get(i).getText();
			System.out.println(suggestion);			
		}
		suggestionList.get(2).click();
		driver.close();
	}
}
