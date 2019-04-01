package office;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UrbanLadder {

	static WebDriver driver;

	public static void writeOnExcel(String menuItems, int i) throws Exception {
		Workbook book = WorkbookFactory.create(new FileInputStream("./testdata/urbanData.xlsx"));
		Sheet sheet = book.getSheet("Sheet1");
		sheet.createRow(0).createCell(0).setCellValue("actual");
		sheet.createRow(i).createCell(0).setCellValue(menuItems);
		FileOutputStream fout = new FileOutputStream("./testdata/urbanData.xlsx");
		book.write(fout);
		fout.close();
	}

	@BeforeMethod
	public static void openApplication() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
	}

	@Test
	public static void testUrbanMenus() throws Exception {

		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		String mainMenuXp = "//div[@id='topnav_wrapper']/ul/li/span";
		List<WebElement> mainMenu = driver.findElements(By.xpath(mainMenuXp));
		Actions a = new Actions(driver);

		int w = 1;
		for (int i = 0; i < mainMenu.size(); i++) {
			Thread.sleep(2000);
			a.moveToElement(mainMenu.get(i)).perform();
			String menu = mainMenu.get(i).getText();
			writeOnExcel(menu, w);
			w++;
			System.out.println("Menu option " + i + " : " + menu);

			String headMenuXp = "//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(text(),\""
					+ menu + "\")]/following-sibling::div/descendant::div[@class='taxontype']/a";
			List<WebElement> headMenu = driver.findElements(By.xpath(headMenuXp));

			for (int j = 0; j < headMenu.size(); j++) {
				Thread.sleep(1000);
				String headMenuText = headMenu.get(j).getText();
				writeOnExcel(headMenuText, w);
				w++;
				System.out.println("Head Menu : " + headMenuText);

				String subMenuXp = "//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(text(),\""
						+ menu + "\")]/following-sibling::div/descendant::div[@class='taxontype']/a[.=\"" + headMenuText
						+ "\"]/parent::div/following-sibling::ul[@class='taxonslist']/li/a/span";
				List<WebElement> subMenu = driver.findElements(By.xpath(subMenuXp));

				for (int k = 0; k < subMenu.size(); k++) {
					String subMenuText = subMenu.get(k).getText();
					writeOnExcel(subMenuText, w);
					w++;
					System.out.println("Sub Menu : " + subMenuText);
				}
			}
		}
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
