package Demo_Web_Shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search' and @role='combobox']"));
		search.sendKeys("");
	}
}
