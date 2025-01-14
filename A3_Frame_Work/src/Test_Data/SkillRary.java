package Test_Data;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SkillRary {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}
	public static void m1(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		WebElement eg = driver.findElement(By.xpath("(//li[@class='dropdown'])[2]"));
		String parent = driver.getWindowHandle();
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.click(eg).perform();
		WebElement sql = driver.findElement(By.xpath("(//a[@class='ignorelink'])[15]"));
		act.click(sql).perform();
		Thread.sleep(1000);
		driver.switchTo().window(parent);
		act.click(eg).perform();
		Thread.sleep(1000);
		WebElement essay = driver.findElement(By.xpath("(//a[@class='ignorelink'])[11]"));
		act.click(essay).perform();
	}
}
