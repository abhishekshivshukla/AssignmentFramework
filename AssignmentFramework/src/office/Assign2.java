package office;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assign2 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shiv/Desktop/Office/single_select_list.html");
		List<WebElement> list = driver.findElements(By.tagName("option"));
		List<WebElement> elements = driver.findElement(By.xpath("//select")).findElements(By.xpath("//option"));
		for(WebElement ele : elements)
		{
			String text = ele.getText();
			System.out.println(text);
		}
		
		List<String> ll=new LinkedList<>();
		
		Assert.assertEquals(list.size(), 4);
		for(WebElement ele : list)
		{
			String text = ele.getText();
			System.out.println(text);
			ll.add(text);
		}
		System.out.println(ll);
		
		Set<String> st=new TreeSet<>(ll);
		Assert.assertEquals(ll, st);		
	}
}
