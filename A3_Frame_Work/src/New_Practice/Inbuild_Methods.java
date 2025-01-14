package New_Practice;

import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Inbuild_Methods {
	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).clear();
		
//		Date date = new Date();
//		System.out.println(date);
//		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
//		System.out.println(sf.format(date));
//		System.out.println("~~~~~~~~~~~~~~~~~~~");
//		System.getProperties().list(System.out);;
		
		RemoteWebDriver driver = new ChromeDriver();
		Capabilities cap = driver.getCapabilities();
		System.out.println(cap.getBrowserName());
		System.out.println(cap.getBrowserVersion());
		
	}
}
