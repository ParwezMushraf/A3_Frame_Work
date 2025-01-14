package New_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart_slider {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//div[@class='YBLJE4'])[3]"))).click().perform();
		action.click(driver.findElement(By.xpath("//a[contains(text(),'T-Shirts')]"))).perform();
		action.dragAndDropBy(driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']")), +50, 0).perform();
		List<WebElement> Assured = driver.findElements(By.xpath("//img[contains(@src,'/img/fa_62673a.png')]"));
		System.out.println(Assured.size());
		for (int i = 2; i <= Assured.size(); i++) {
			System.out.print(driver.findElement(By.xpath("(//img[contains(@src,'/img/fa_62673a.png')])[" + i + "]/../../a[1]")).getText() + " : ");
			System.out.println(driver.findElement(By.xpath("(//img[contains(@src,'/img/fa_62673a.png')])[" + i + "]/../../a[2]/div/div[1]")).getText());
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
