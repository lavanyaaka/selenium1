package Practise.SeleniumProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver launchBrowser() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Practise\\SeleniumProject\\constants.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static String getData(int row, int cell) throws Throwable {
		File loc = new File(System.getProperty("user.dir") + "\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		String v = null;
		Row r1 = s.getRow(row);
		Cell c1 = r1.getCell(cell);
		CellType type = c1.getCellType();
		System.out.println(type);
		if (type == CellType.STRING) {
			v = c1.getStringCellValue();

		} else if (type == CellType.NUMERIC) {
			if (DateUtil.isCellDateFormatted(c1)) {
				Date d = c1.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
				v = sim.format(d);
			}

			else {

				double n = c1.getNumericCellValue();
				long l = (long) n;
				v = String.valueOf(l);

			}

		}
		return v;
	}

}
