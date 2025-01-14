package Test_Data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Note_Data {
	public static void main(String[] args) throws IOException {
//		//create an obj for FileInputStream and pass NotePad Address
//		FileInputStream fis = new FileInputStream("./Testdata_note/demo_note.properties");
//		//use WorkbookFactory
//		Properties prot = new Properties();
//		//use prot methods
//		prot.load(fis);
//		//store in keys formate
//		String url = prot.getProperty("url");
//		String browser = prot.getProperty("browser");
//		System.out.println(url);
//		System.out.println(browser);
		
		FileInputStream fis = new FileInputStream("./Testdata_note/Test_case.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String name = cell.getStringCellValue();
		System.out.println(name);
	}
}
