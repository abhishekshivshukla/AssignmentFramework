package scripts;

/*import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;*/


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//import org.openqa.selenium.interactions.Actions;

public class Assignment20 extends BaseClassChrome {

	@Test
	public static void scenario20() throws Exception {
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui')]"));
	    for (int i = 1; i <=100 ; i++) 
	    {
	            slider.sendKeys(Keys.ARROW_RIGHT);
	    }
	    for (int i = 1; i <=100 ; i++) 
	    {
            slider.sendKeys(Keys.ARROW_LEFT);
        }
		
		
		/*Actions ac=new Actions(driver);
		ac.clickAndHold(slider).perform();
		
		Robot r=new Robot();
		for(int i=1; i<=100; i++)
		{
			Thread.sleep(50);
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);
		}
		for(int i=1; i<=100; i++)
		{
			Thread.sleep(50);
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);
		}
		ac.release().perform();*/
		
		/*WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui')]"));
		
	    for (int i = 1; i <=100 ; i++) 
	    {
	            slider.sendKeys(Keys.ARROW_RIGHT);
	        }
	    for (int i = 1; i <=100 ; i++) 
	    {
            slider.sendKeys(Keys.ARROW_LEFT);
        }
		driver.close();	*/	
	}	
}
