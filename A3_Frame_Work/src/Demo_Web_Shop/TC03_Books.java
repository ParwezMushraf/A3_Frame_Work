package Demo_Web_Shop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC03_Books {
	@Test(groups = "integration")
	public void Books() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]")).click();
		driver.findElement(By.xpath("//span[@class='cart-label' and text()='Shopping cart']")).click();
		WebElement element = driver.findElement(By.xpath("(//a[text()='Computing and Internet'])[2]"));
		boolean flag = element.isDisplayed();
		if(flag)
			Reporter.log(element.getText()+" is Displayed ",true);
		driver.quit();
	}
}
