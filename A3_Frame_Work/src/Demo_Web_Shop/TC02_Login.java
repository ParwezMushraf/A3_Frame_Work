package Demo_Web_Shop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC02_Login {
	@Test(groups = "functionality")
	public void Login() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("headless");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("parwez123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Reporter.log("Login passed",true);
		driver.quit();
	}
}