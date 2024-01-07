package Auto;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.devtools.v117.audits.model.FederatedAuthRequestIssueDetails;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSupplier {

	@DataProvider(name = "usingObjectArray")
	public Object[][] rahul() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "Admin";
		data[1][1] = "Admin123";

		return data;
	}

	@DataProvider(name = "usingIterator")
	public Iterator<String> rahul2() {
		List<String> lst = new ArrayList<String>();
		lst.add("Rahul");
		lst.add("Ankit");
		lst.add("Mahesh");
		lst.add("Kunal");
		lst.add("Hemant");
		lst.add("Riya");

		Iterator<String> itr1 = lst.iterator();
		return itr1;
	}

	@DataProvider(name = "ReadDataFromExcel", parallel = true)
	@Test
	public static String[][] ReadDataFromExcel() throws IOException {
		File Excel = new File(
				"C:\\Users\\Rahul Nishad\\eclipse-workspace\\PracticeTestNG\\src\\test\\resources\\ReadData.xlsx");
		FileInputStream fis = new FileInputStream(Excel);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rownum = sheet.getLastRowNum();
		int colnum = sheet.getRow(rownum).getLastCellNum();

		String[][] str = new String[rownum][colnum];

		for (int i = 0; i < rownum; i++) {
			for (int j = 0; j < colnum; j++) {
				str[i][j] = sheet.getRow(i + 1).getCell(j).getStringCellValue();
			}
		}
//			for (String[] string : str) {
//				System.out.println(Arrays.toString(string));
//			}
		workbook.close();
		fis.close();

		return str;

	}

}
