package office;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPAndAssertion {
	
	@DataProvider
	public static Object[][] urbanDataBank() throws Exception{
		Workbook wb = WorkbookFactory.create(new FileInputStream("./testdata/urbanData.xlsx"));
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		
		Object urbanData[][]= new Object[row][col];
		for(int i=1; i<row; i++) {
			for(int j=0; j<col; j++)
			{
				urbanData[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return urbanData;
	}
	
	@Test(dataProvider="urbanDataBank")
	public void testData(String expected, String actual) {
		Assert.assertEquals(expected, actual);
	}

}
