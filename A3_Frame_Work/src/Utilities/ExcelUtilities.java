package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelUtilities {
	
	public static void main(String[] args) {
		Map<String, String> map = new ExcelUtilities().readExcel();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.localhost:8888/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin",Keys.TAB,Keys.ENTER);
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(map.get("Organization Name"));
		WebElement industry = driver.findElement(By.xpath("//select[@name='industry']"));
		Select sel = new Select(industry);
		sel.selectByVisibleText(map.get("Industry"));
		
		WebElement type = driver.findElement(By.xpath("//select[@name='accounttype']"));
		sel = new Select(type);
		sel.selectByVisibleText(map.get("Type"));
	}
	
	
	Workbook wb;
	
	
	public Map<String, String> readExcel() {
		Map<String, String> map = new HashMap<String, String>();
		DataFormatter type = new DataFormatter();

		FileInputStream fis=null;
		try {
			fis = new FileInputStream("./Data/VtigerCRMTestData.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet sheet = wb.getSheet("OrganizationsTestData");
		
		int requiredRowNum = 0;
				// 0        7
		for(int i = 0; i <= sheet.getLastRowNum(); i++) {
			requiredRowNum = i;
			if(type.formatCellValue(sheet.getRow(i).getCell(1)).equals("Create Organization With Industry And Type")) {
				break;
			}
		}
		
		for(int i=requiredRowNum; i<=sheet.getLastRowNum();i++) {
			if(type.formatCellValue(sheet.getRow(i).getCell(2)).equals("####"))
				break;
			map.put(type.formatCellValue(sheet.getRow(i).getCell(2)), type.formatCellValue(sheet.getRow(i).getCell(3)));
		}
		return map;
		
	
		
//		FileInputStream fis =new FileInputStream("./Testdata_note/Test_case.xlsx");
//							// Workbook interface   Sheet interface  Row interface  Cell interface 
//		System.out.println(WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
//		
//		Cell cell =WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(1);
//		DataFormatter type = new DataFormatter();
//		System.out.println(type.formatCellValue(cell));
//		
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sheet = wb.getSheet("Sheet1");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//  
//		driver.get(type.formatCellValue(sheet.getRow(0).getCell(1)));
//		driver.findElement(By.id("email")).sendKeys(type.formatCellValue(sheet.getRow(1).getCell(1)));
//		driver.findElement(By.id("password")).sendKeys(type.formatCellValue(sheet.getRow(2).getCell(1)));

	}
}
