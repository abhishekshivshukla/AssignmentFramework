package office;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://shiv/login.do");
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		long parseInt = Integer.parseInt(wh);
		System.out.println(parseInt);
		/*long parseLong = Long.parseLong(wh);
		System.out.println(parseLong);
		//driver.close();
*/	}

}
