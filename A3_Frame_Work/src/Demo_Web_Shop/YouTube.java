package Demo_Web_Shop;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.youtube.com/");
		Thread.sleep(5);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");
		
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for(String window : windows) {
			if(parentWindow.equals(window)) {
			}else {
				driver.switchTo().window(window);
			}
		}
		
		driver.get("https://www.yout.com/");
		Thread.sleep(5);
//		for (int i = 1; i <= 30; i++) {
//			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search' and @role='combobox']"));
//			// Entering Data into Search TextField
//			search.sendKeys("Quran-Para 0"+i+"/30 English Translation");
//			// click on More Element
//			driver.findElement(By.xpath("(//div[@id='dismissible'])[101]/div/div/div/div/ytd-menu-renderer/ytd-menu-renderer/button")).click();
//			// Click on Share Element Icon
//			driver.findElement(By.xpath("(//yt-icon/span)[80]")).click();
//			// Click on Copy Element
//			driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[39]")).click();
//			// Click on Cancel Button
//			driver.findElement(By.xpath("(//*[name()='svg'])[150]")).click();
//		}
	}
}
