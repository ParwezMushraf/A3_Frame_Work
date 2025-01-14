package Demo_Web_Shop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC05_Electronics {
	@Test(groups = "endtoend")
	public void Electronics() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		//click on Electronics
		driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[3]")).click();
		//click on camera,phone
		driver.findElement(By.xpath("//img[@title='Show products in category Camera, photo']")).click();
		//Fetch Price of Handycam
		WebElement price = driver.findElement(By.xpath("//a[text()='1MP 60GB Hard Drive Handycam Camcorder']/../../div[3]/div[1]/span"));
		Reporter.log(price.getText(),true);
		driver.quit();
	}
}
