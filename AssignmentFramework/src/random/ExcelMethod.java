package random;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMethod {
	
	static SortedMap<String,String> tm=new TreeMap<String,String>();
	
	public static String getMapDataFromExcel(String tcId, String headder) throws Exception
	{
	Scanner sc=new Scanner(System.in);
	Workbook wb = WorkbookFactory.create(new FileInputStream("./testdata/testcasedata.xlsx"));
	Sheet sheet = wb.getSheet("Sheet1");
	int lastRowNum = sheet.getLastRowNum();
	int lastCellNum = sheet.getRow(0).getLastCellNum();
	
	for(int i=1 ; i<lastRowNum ; i++)
	{
		for(int j=0; j<lastCellNum; j++)
		{
			String tc = sheet.getRow(i).getCell(0).toString();
			String headValue = sheet.getRow(0).getCell(j).toString();
			if(headder.equals(headValue))
			{
				String value = sheet.getRow(i).getCell(j).toString();
				tm.put(tc, value);
			}
		}
	}
	sc.close();
	System.out.println((int)Double.parseDouble(tm.get(tcId)));
	return tm.get(tcId);	
	}
}
