package Demo_Web_Shop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC04_Computers {
	@Test(groups = "endtoend")
	public void Computers() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Robot r = new Robot();
		driver.get("https://demowebshop.tricentis.com");
		//Computer Link
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[3]")).click();
		//click on computer img
		driver.findElement(By.xpath("//img[@title='Show products in category Desktops']")).click();
		//click on Build our own Computer
		driver.findElement(By.cssSelector("img[title='Show details for Build your own cheap computer']")).click();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//Select Software Image viwer
		driver.findElement(By.cssSelector("input[value='93']")).click();
		//click on add to cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		//click on shoping 
		driver.findElement(By.xpath("//span[@class='cart-label' and text()='Shopping cart']")).click();
		//Picture of Build your own cheap computer
		boolean flag = driver.findElement(By.xpath("(//img[@alt='Picture of Build your own cheap computer'])[2]")).isDisplayed();
		if(flag) {
			Reporter.log("Computer is Displayed ",true);
		}
		driver.quit();
	}
}
