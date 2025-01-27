package New_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fitpeo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.fitpeo.com/revenue-calculator");
		Thread.sleep(3);
		Actions act = new Actions(driver);
		Thread.sleep(3);
		act.scrollToElement(driver.findElement(By.xpath("//input[@type='number']"))).perform();
		Thread.sleep(3);
		driver.findElement(By.xpath("//input[@type='number']")).clear();
		Thread.sleep(3);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("500");
		Thread.sleep(3);
		driver.findElement(By.xpath("//input[@type='number']")).clear();
		Thread.sleep(3);
		act.dragAndDropBy(driver.findElement(By.xpath("//input[@data-index='0']")), 100, 0).perform();
		Thread.sleep(3);
		//driver.quit();
	}

}
